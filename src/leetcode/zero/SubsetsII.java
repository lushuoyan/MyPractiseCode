package leetcode.zero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月17日
 */
public class SubsetsII{
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(nums);
		dfs(nums, 0, result, results);
		return results;
	}

	private static void dfs(int[] num, int step, List<Integer> result,
			List<List<Integer>> results) {
		if (!results.contains(result))
			results.add(new ArrayList<Integer>(result));
		for (int i = step; i < num.length; i++) {
			result.add(num[i]);
			dfs(num, i + 1, result, results);
			result.remove(result.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 2 };
		subsetsWithDup(nums);
	}
}
