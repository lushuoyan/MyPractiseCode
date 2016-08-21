package leetcode.zero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets{
	void dfs(int[] S, int start, int number,
			ArrayList<Integer> array, List<List<Integer>> result) {
		if (number == array.size()) {
			result.add(new ArrayList<Integer>(array));
			return;
		}
		for (int i = start; i < S.length; i++) {
			array.add(S[i]);
			dfs(S, i + 1, number, array, result);
			array.remove(array.size() - 1);
		}
	}

	public List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		result.add(array);
		if (S == null) {
			return result;
		}
		Arrays.sort(S);
		for (int i = 1; i <= S.length; i++) {
			array.clear();
			dfs(S, 0, i, array, result);
		}
		return result;
	}
}