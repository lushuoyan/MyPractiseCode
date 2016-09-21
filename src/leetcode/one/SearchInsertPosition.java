package leetcode.one;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 5, 6, 7, 8, 9, 10 };
		System.out.println(searchInsert(nums, 8));
	}

	public static int searchInsert(int[] nums, int target) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > target||nums[i] == target) {
				result = i ;
				break;
			}
			result++;
		}
		return result;
	}

}
