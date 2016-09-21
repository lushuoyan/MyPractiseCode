package leetcode.one;

public class FirstMissingPositive {

	public static void main(String[] args) {

	}

	public int firstMissingPositive(int[] nums) {
		if (nums.length == 0 || nums == null)
			return 1;
		// ��Ԫ�ط�����ȷ��λ�ã�����1����A[0]��2����A[1]...
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
