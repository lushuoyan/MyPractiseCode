package newcoder.bat2.lesson2;

public class MaxSumBetweenTwoSubArray {

	public static int maxSum(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		int[] h = new int[arr.length];
		h[arr.length - 1] = arr[arr.length - 1];
		int cur = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			cur = cur < 0 ? 0 : cur;
			cur += arr[i];
			h[i] = Math.max(h[i + 1], cur);
		}
		int res = arr[0] + h[1];
		int lmax = arr[0];
		cur = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			cur = cur < 0 ? 0 : cur;
			cur += arr[i];
			lmax = Math.max(lmax, cur);
			res = Math.max(res, lmax + h[i + 1]);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { -11, -10, 6, 4, 5, 3, -7, -8, 3, 6, 9, 1, -7 };
		System.out.println(maxSum(arr));
	}

}
