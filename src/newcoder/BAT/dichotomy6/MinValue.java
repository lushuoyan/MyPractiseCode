package newcoder.BAT.dichotomy6;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月4日
 */
public class MinValue{
	public int getMin(int[] arr, int n) {
		if (n == 0 || arr == null) {
			return -1;
		}
		int left = 0;
		int right = n - 1;
		int mid = (left + right) / 2;
		if (arr[left] < arr[right]) {
			return arr[left];
		}
		while (left < right) {
			mid = left + (right - left) / 2;
			if (arr[left] > arr[mid])
				right = mid;
			else if (arr[mid] > arr[left])
				left = mid;
			else {
				mid++;
				break;
			}
		}
		return arr[mid];
	}
}
