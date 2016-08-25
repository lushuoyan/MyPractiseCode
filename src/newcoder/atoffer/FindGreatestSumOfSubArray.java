package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��25��
 */
public class FindGreatestSumOfSubArray{
	public int FindGreatestSumOfSubArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		int res = array[0];
		int maxValue = 0;
		for (int i = 0; i < array.length; i++) {
			maxValue += array[i];
			if (res < maxValue) {
				res = maxValue;
			}
			if (maxValue < 0) {
				maxValue = 0;
			}
		}
		return res;
	}
}
