package leetcode.one;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void moveZeroes(int[] nums) {
		int size = 0;
		int length = nums.length;
		int val = 0;
		for (int i = 0; i < length; i++) {
			if (nums[i] != val)
				nums[size++] = nums[i];
		}
	}
}
