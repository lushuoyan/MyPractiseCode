package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning{
	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		if (s.length() == 0) {
			return res;
		}
		dfs(s, 0, new ArrayList<String>(), res);
		return res;
	}

	private void dfs(String s, int start, ArrayList<String> list,
			List<List<String>> res) {
		if (start == s.length()) {
			ArrayList<String> temp = new ArrayList<String>(list);
			res.add(temp);
			return;
		}
		for (int i = start + 1; i <= s.length(); i++) {
			String temp = s.substring(start, i);
			if (isPalindrome(temp)) {
				list.add(temp);
				dfs(s, i, list, res);
				list.remove(list.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
