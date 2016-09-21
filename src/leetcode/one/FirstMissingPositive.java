package leetcode.one;

public class FirstMissingPositive {

	public static void main(String[] args) {

	}

	public int firstMissingPositive(int[] nums) {
		if (nums.length == 0 || nums == null)
			return 1;
		// 把元素放入正确的位置，例如1放在A[0]，2放在A[1]...
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] != i + 1) {
				if (nums[i] >= nums.length || nums[i] <= 0 || nums[i] == nums[nums[i] - 1])
					break;
				int temp = nums[i];
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}
		return nums.length + 1;
	}
}
