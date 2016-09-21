package leetcode.one;

import java.util.Stack;

public class CreateMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] maxNumber(int[] nums1, int[] nums2, int k) {
		int len1 = nums1.length;
		int len2 = nums2.length;

		int[] result = new int[k];
		int start = Math.max(0, k - len2);
		int end = Math.min(k, len1) + 1;
		int index = 0;
		for (int i = start; i <= end; i++) {
			int[] temp = merge(getMax(nums1,i),getMax(nums2,k-i));
			
		}

		return result;
	}

	private int[] getMax(int[] nums, int t) {
		int size = nums.length;
		Stack<Integer> ans = new Stack<Integer>();

		for (int i = 0; i < size; i++) {
			while (ans != null && ans.size() + size - i > t
					&& ans.peek() < nums[i]) {
				ans.pop();
			}
			if (ans.size() < t) {
				ans.push(nums[i]);
			}
		}
		int[] result = new int[ans.size()];
		for (int i = ans.size() - 1; i > -1; i--) {
			result[i] = ans.pop();
		}
		return result;
	}

	private int[] merge(int[] nums1, int[] nums2) {
		Stack<Integer> ans = new Stack<Integer>();

		int[] result = new int[ans.size()];
		for (int i = ans.size() - 1; i > -1; i--) {
			result[i] = ans.pop();
		}
		return result;

	}
}
