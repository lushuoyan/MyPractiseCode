package newcoder.BAT.string3;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月21日
 */
public class DistinctSubstring{
	public static int longestSubstring(String A, int n) {
		if (A == null || n < 1)
			return 0;
		char[] a = A.toCharArray();
		int[] map = new int[256];
		for (int i = 0; i < 256; i++)
			map[i] = -1;
		int len = 0;
		int pre = -1;
		int cur = 0;
		for (int i = 0; i < n; i++) {
			pre = Math.max(pre, map[a[i]]);
			cur = i - pre;
			len = Math.max(len, cur);
			map[a[i]] = i;
		}
		return len;
	}

	public static void main(String[] args) {
		System.out.println(longestSubstring("rfrxkmdb", 8));
	}
}
