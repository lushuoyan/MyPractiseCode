package leetcode.three;

public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		boolean[] arr = new boolean[128];
		char[] sarr = s.toCharArray();
		int min = -1;
		for (int i = 0; i < sarr.length; i++) {
			if (arr[sarr[i] - 'A']) {
				
			}
		}

		return -1;
	}
}
