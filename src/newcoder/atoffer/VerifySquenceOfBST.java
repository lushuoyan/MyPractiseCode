package newcoder.atoffer;

/**
 * 类描述 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
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
