package leetcode.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月2日
 */
public class Combinations{
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (n <= 0 || n < k)
			return res;
		dfs(n, k, 1, new ArrayList<Integer>(), res);
		return res;
	}

	public static void dfs(int n, int k, int cur, ArrayList<Integer> curA,
			List<List<Integer>> res) {
		if (curA.size() == k) {
			res.add(new ArrayList<Integer>(curA));
			return;
		}

		for (int i = cur; i <= n; i++) {
			curA.add(i);
			dfs(n, k, i + 1, curA, res);
			curA.remove(curA.size() - 1);
		}
	}

}
