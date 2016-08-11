package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3 };
		List<List<Integer>> result = permute(input);
		for (int i = 0; i < result.size(); i++) {
			List<Integer> temp = result.get(i);
			for (int j = 0; j < temp.size(); j++) {
				System.out.print(temp.get(j) + " ");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums.length == 0) {
			return result;
		}
		dfs(result, nums, 0);
		return result;
	}

	private static void dfs(List<List<Integer>> result, int[] nums, int i) {
		List<Integer> temp = new ArrayList<Integer>();
		if (i == nums.length) {
			for (int j = 0; j < nums.length; j++) {
				temp.add(nums[j]);
			}
			result.add(temp);
			return;
		}
		for (int j = i; j < nums.length; j++) {
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
			dfs(result, nums, i + 1);
			tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
	}
}
