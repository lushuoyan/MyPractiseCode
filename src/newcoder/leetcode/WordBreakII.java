package newcoder.leetcode;

import java.util.ArrayList;
import java.util.Set;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月18日
 */
public class WordBreakII{
	public ArrayList<String> wordBreak(String s, Set<String> dict) {
		ArrayList<String> result = new ArrayList<String>();
		getAllPossible(s, dict, s.length(), result, new ArrayList<String>());
		return result;
	}

	public void getAllPossible(String s, Set<String> dict, int pos,
			ArrayList<String> list, ArrayList<String> myString) {
		if (pos == 0) {
			StringBuffer sb = new StringBuffer();
			for (int i = myString.size() - 1; i > 0; i--) {
				sb.append(myString.get(i) + " ");
			}
			list.add(sb.append(myString.get(0)).toString());
			return;
		}
		for (int k = pos - 1; k > -1; k--) {
			String temp = s.substring(k, pos);
			if (!dict.contains(temp)) {
				continue;
			}
			myString.add(temp);
			getAllPossible(s, dict, k, list, myString);
			myString.remove(myString.size() - 1);
		}
	}
}
