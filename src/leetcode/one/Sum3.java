package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3) {
			return result;
		}
		Arrays.sort(nums);
		if (nums[0] >= 0) {
			return null;
		}
		if (nums[nums.length - 1] <= 0) {
			return null;
		}
		int len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			find(nums, i + 1, len - 1, nums[i]); // 寻找两个数与num[i]的和为0
		}
		return result;
	}

	private void find(int[] num, int begin, int end, int target) {
		int l = begin, r = end;
		while (l < r) {
			if (num[l] + num[r] + target == 0) {
				List<Integer> ans = new ArrayList<Integer>();
				ans.add(target);
				ans.add(num[l]);
				ans.add(num[r]);
				result.add(ans); // 放入结果集中
				while (l < r && num[l] == num[l + 1])
					l++;
				while (l < r && num[r] == num[r - 1])
					r--;
				l++;
				r--;
			} else if (num[l] + num[r] + target < 0) {
				l++;
			} else {
				r--;
			}
		}
	}
}
