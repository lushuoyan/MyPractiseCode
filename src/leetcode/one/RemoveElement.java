package leetcode.one;

public class RemoveElement {

	public static void main(String[] args) {
		int[] input = { 4, 5 };
		System.out.println(removeElement(input, 4));
	}

	public static int removeElement(int[] nums, int val) {
		int size = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (nums[i] != val)
				nums[size++] = nums[i];
		}
		return size;
	}
}
