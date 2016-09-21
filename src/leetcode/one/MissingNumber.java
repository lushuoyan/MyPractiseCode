package leetcode.one;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int[] array = new int[nums.length + 1];
		int min = 0;

		for (int i = 0; i < nums.length; i++) {
			array[nums[i] - min] = nums[i];
		}
		int result = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] != array[i] + 1) {
				result = i + 1 + min;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] input = { 0};
		System.out.println(missingNumber(input));
	}
}
