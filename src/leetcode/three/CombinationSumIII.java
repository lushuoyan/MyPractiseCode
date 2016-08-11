package leetcode.three;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月10日
 */
public class CombinationSumIII{
	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (k > n || k * 9 < n) {
			return res;
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			temp.add(i);
			dfs(res, temp, i, k, n, 1);
			temp.remove(0);
		}
		return res;
	}

	private static void dfs(List<List<Integer>> res, ArrayList<Integer> temp,
			int tempRes, int k, int n, int i) {
		if (i == k) {
			if (tempRes == n) {
				res.add(new ArrayList<Integer>(temp));
			}
			return;
		}
		if (tempRes > n) {
			return;
		}
		for (int j = temp.get(i - 1) + 1; j < 10; j++) {
			temp.add(j);
			dfs(res, temp, tempRes + j, k, n, i + 1);
			temp.remove(i);
		}
	}

	public static void main(String[] args) {
		combinationSum3(3, 9);
	}
}
