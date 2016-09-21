package leetcode.one;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean increasingTriplet(int[] nums) {
		int n = nums.length;
		if (n < 3) {
			return false;
		}

		int[] dp = new int[n];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);

					if (dp[i] == 2)
						return true;
				}
			}

		}
		return false;
	}
}
