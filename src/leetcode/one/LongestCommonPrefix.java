package leetcode.one;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] input = {"flower","flight","flow"};
		System.out.println(longestCommonPrefix(input));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		String shortestS = strs[0];
		int temp = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < temp) {
				shortestS = strs[i];
				temp = strs[i].length();
			}
		}
		while (!"".equals(shortestS)) {
			int i = 0;
			t: for (; i < strs.length; i++) {
				if (strs[i].indexOf(shortestS) != 0) {
					shortestS = shortestS.substring(0, shortestS.length() - 1);
					break t;
				}
			}
			if (i == strs.length) {
				break;
			}

		}
		return shortestS;
	}
}
