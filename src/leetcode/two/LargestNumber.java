package leetcode.two;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月2日
 */
public class LargestNumber{
	public String largestNumber(int[] num) {
		int n = num.length;
		if (n < 1)
			return "";

		String[] strs = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = String.valueOf(num[i]);
		}

		Arrays.sort(strs, new Cmp());

		String ans = "";
		for (int i = n - 1; i >= 0; i--) {
			ans = ans.concat(strs[i]);
		}

		int i = 0;
		while (i < n && ans.charAt(i) == '0') {
			i++;
		}
		if (i == n)
			return "0";

		return ans.substring(i);
	}

	class Cmp implements Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			return (s1 + s2).compareTo(s2 + s1);
		}
	}

}
