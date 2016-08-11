package newcoder.bat2.lesson2;

public class MaxSubArraySum {

	public static int maxSum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int res = arr[0];
		int cur = arr[0];
		for (int i = 1; i < arr.length; i++) {
			cur = cur < 0 ? 0 : cur;
			cur += arr[i];
			res = Math.max(res, cur);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 3, -1, 2, 1, -6, 5, 2, 3, -2, 7 };
		System.out.println(maxSum(arr));
	}

}
