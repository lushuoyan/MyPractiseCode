package leetcode.zero;

public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int largestSum = nums[0];
		int past = 0;
		for (int i = 0; i < nums.length - past; i++) {
			int tempSum = 0;
			for (int j = i; j < nums.length; j++) {
				tempSum += nums[j];
				if(tempSum<0&&largestSum>tempSum){
					break;
				}
				if (tempSum > largestSum) {
					largestSum = tempSum;
				}
			}
		}
		System.out.println(largestSum);
	}
}
