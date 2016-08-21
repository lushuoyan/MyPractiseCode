package leetcode.zero;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<String>();
		dfs(ans, "", n, n);
		return ans;
	}

	private void dfs(List<String> ans, String s, int left, int right) {
		if (left > right) {
			return;
		}

		if (right == 0 && right == 0) {
			ans.add(s);
		}

		if (left > 0) {
			dfs(ans, s + "(",left-1, right);
		}

		if (right > 0) {
			dfs(ans, s + ")", left, right-1);
		}
	}
}
