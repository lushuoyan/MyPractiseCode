package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��25��
 */
public class MoreThanHalfNum{
	public int MoreThanHalfNum_Solution(int[] array) {
		if (array == null) {
			return 0;
		}
		int[] times = new int[10];
		int res = 0;
		int half = array.length / 2;
		int i = 0;
		for (; i < half; i++) {
			times[array[i]]++;
		}
		for (; i < array.length; i++) {
			times[array[i]]++;
			if(times[array[i]]>half){
				res = array[i];
				break;
			}
		}
		return res;
	}
}
