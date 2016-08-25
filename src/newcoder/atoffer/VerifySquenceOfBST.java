package newcoder.atoffer;

/**
 * ������ ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ���� ����������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 * @author luoshuoyan
 * @date 2016��8��25��
 */
public class VerifySquenceOfBST{
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0)
			return false;
		return IsTreeBST(sequence, 0, sequence.length - 1);
	}

	public boolean IsTreeBST(int[] sequence, int start, int middle) {
		if (middle <= start)
			return true;
		int i = start;
		for (; i < middle; i++) {
			if (sequence[i] > sequence[middle]){
				break;
			}
		}
		for (int j = i; j < middle; j++) {
			if (sequence[j] < sequence[middle]){
				return false;
			}
				
		}
		return IsTreeBST(sequence, start, i - 1)
				&& IsTreeBST(sequence, i, middle - 1);
	}
}
