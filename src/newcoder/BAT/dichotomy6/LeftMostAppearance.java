package newcoder.BAT.dichotomy6;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月4日
 */
public class LeftMostAppearance{
	public int findPos(int[] arr, int n, int num) {
		if (arr == null || n == 0) {
			return -1;
		}
		if (arr[0] > num || arr[num - 1] < num) {
			return -1;
		}
		int left = 0, right = n - 1, mid = 0, res = -1;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (arr[mid] < num) {
				left = mid + 1;
			} else if (arr[mid] > num) {
				right = mid - 1;
			} else {
				res = mid;
				right = mid - 1;
			}
		}
		return res;
	}
}
