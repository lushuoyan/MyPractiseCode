package leetcode.one;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月17日
 */
public class InterleavingString{
	public boolean isInterleave(String s1, String s2, String s3) {
		if (s3.length() != (s1.length() + s2.length())) {
			return false;
		}
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		char[] char3 = s3.toCharArray();

		boolean[][] d = new boolean[s1.length() + 1][s2.length() + 1];
		d[0][0] = true;

		for (int i = 1; i <= char1.length; i++) {
			if (char1[i-1] == char3[i - 1]) {
				d[i][0] = true;
			} else {
				break;
			}
		}

		for (int j = 1; j <= s2.length(); j++) {
			if (char2[j - 1] == char3[j - 1]) {
				d[0][j] = true;
			} else {
				break;
			}
		}

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				d[i][j] |= d[i - 1][j] && char1[i - 1] == char3[i + j - 1];
				d[i][j] |= d[i][j - 1] && char2[j - 1] == char3[i + j - 1];
			}
		}

		return d[s1.length()][s2.length()];
	}
}
