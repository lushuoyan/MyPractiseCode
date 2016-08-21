package leetcode.two;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月10日
 */
public class KthLargestElementinanArray{
	public int findKthLargest(int[] nums, int k) {
		return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
	}

	private int getKth(int k, int[] nums, int start, int end) {
		int pivot = nums[end];
		int left = start;
		int right = end;
		while (true) {
			while (nums[left] < pivot && left < right) {
				left++;
			}
			while (nums[right] >= pivot && right > left) {
				right--;
			}
			if (left == right) {
				break;
			}
			swap(nums, left, right);
		}
		swap(nums, left, end);
		if (k == left + 1) {
			return pivot;
		} else if (k < left + 1) {
			return getKth(k, nums, start, left - 1);
		} else {
			return getKth(k, nums, left + 1, end);
		}
	}

	private void swap(int[] nums, int n1, int n2) {
		int temp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = temp;
	}

}
