package leetcode.two;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��2��
 */
public class ValidPerfectSquare{
	public static boolean isPerfectSquare(int num) {
		if (num < 1) {
			return false;
		}
		if (num == 1) {
			return true;
		}
		int left = 0;
		int right = num / 2;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			long res = mid * mid;
			if (res == num) {
				return true;
			} else if (res > num) {
				right = (int) (mid - 1);
			} else {
				left = (int) (mid + 1);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(808201));
	}
}
