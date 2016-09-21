package leetcode.one;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumProductofWordLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProduct(String[] words) {
		int[] maps = new int[words.length];

		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});

		for (int i = 0; i < words.length; i++) {
			int bits = 0;
			for (int j = 0; j < words[i].length(); j++) {
				char c = words[i].charAt(j);
				bits = bits | (1 << (c - 'a'));
			}
			maps[i] = bits;
		}

		int max = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() * words[i].length() <= max)
				break;
			for (int j = i + 1; j < words.length; j++) {
				if ((maps[i] & maps[j]) == 0) {
					max = Math.max(max, words[i].length() * words[j].length());
					break;
				}
			}
		}
		return max;
	}
}
