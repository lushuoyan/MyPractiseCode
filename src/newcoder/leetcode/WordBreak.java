package newcoder.leetcode;

import java.util.Set;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��17��
 */
public class WordBreak{
	public boolean wordBreak(String s, Set<String> dict) {
		boolean[] t = new boolean[s.length() + 1];
		t[0] = true;
		for (int i = 0; i < s.length(); i++) {
			if (!t[i]) {
				continue;
			}
			for (String temp : dict) {
				int end = i + temp.length();
				if (end > s.length()) {
					continue;
				}
				if (t[end]) {
					continue;
				}
				if (s.substring(i, end).equals(temp)) {
					t[end] = true;
				}
			}
		}
		return t[s.length()];
	}
}
