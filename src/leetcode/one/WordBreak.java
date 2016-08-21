package leetcode.one;

import java.util.Set;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月1日
 */
public class WordBreak{
	/*
	 * 分析： 一开始看到这个题目，我的第一反应是要递归，但是之后感觉递归的做法估计没办法通过，然后就开始想，之后看到别人的思路之后，感觉其实还挺容易的。
	 * 解题思路： 一个字符串S，它的长度为N，如果S能够被“字典集合”（dict）中的单词拼接而成，那么所要满足的条件为： F(0, N) = F(0,
	 * i) && F(i, j) && F(j, N);
	 * 这样子，如果我们想知道某个子串是否可由Dict中的几个单词拼接而成就可以用这样的方式得到结果（满足条件为True,
	 * 不满足条件为False）存入到一个boolean数组的对应位置上，这样子，最后boolean数组的最后一位就是F(0,
	 * N)的值，为True表示这个字符串S可由Dict中的单词拼接，否则不行！ 话不多说，上AC代码！！
	 */
	public static boolean wordBreak(String s, Set<String> dict) {
		boolean[] t = new boolean[s.length() + 1];
		t[0] = true;
		for (int i = 0; i < s.length(); i++) {
			if (!t[i])
				continue;
			for (String a : dict) {
				int len = a.length();
				int end = i + len;
				if (end > s.length()) {
					continue;
				}
				if (t[end]) {
					continue;
				}
				if (s.substring(i, end).equals(a)) {
					t[end] = true;
				}
			}
		}
		return t[s.length()];
	}
}
