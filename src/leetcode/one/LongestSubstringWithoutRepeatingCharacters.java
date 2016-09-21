package leetcode.one;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abba";
		if (s == null || "".equals(s)) {
			System.out.println(0);
		}
		if (s.length() == 1) {
			System.out.println(1);
		}
		int result = 1;
		String longestS = s.substring(0, 1);
		s = s.substring(1);
		while (!"".equals(s)) {
			if (s.length() < result) {
				while (!"".equals(s)) {
					String temp = s.substring(0, 1);
					if (longestS.indexOf(temp) == -1) {
						result++;
					}
					s = s.substring(1);
				}
				break;
			}
			if (longestS.equals(s.substring(0, result))) {
				s = s.substring(result);
				continue;
			}
			if (longestS.indexOf(s.substring(0, 1)) > -1) {
				s = s.substring(1);
				continue;
			}
			result++;
			longestS += s.substring(0, 1);
			s = s.substring(1);
		}
		System.out.println(result);
	}

	public int lengthOfLongestSubstring(String s) {
		if (s == null)
			return 0;
		boolean[] flag = new boolean[256];

		int result = 0;
		int start = 0;
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char current = arr[i];
			if (flag[current]) {
				result = Math.max(result, i - start);
				for (int k = start; k < i; k++) {
					if (arr[k] == current) {
						start = k + 1;
						break;
					}
					flag[arr[k]] = false;
				}
			} else {
				flag[current] = true;
			}
		}

		result = Math.max(arr.length - start, result);

		return result;
	}
}
