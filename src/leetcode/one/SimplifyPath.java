package leetcode.one;

import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
		String result = "";
		String[] word = path.split("/");
		Stack<String> stk = new Stack<String>();
		for (int i = 0; i < word.length; i++) {

			if (word[i].equals("..")) {

				if (!stk.empty())
					stk.pop();

			} else if (word[i].equals(".") || word[i].equals(""))
				continue;
			else
				stk.push(word[i]);

		}
		for (int i = 0; i < stk.size(); i++) {
			result += "/" + stk.get(i);
		}
		return result.equals("") ? "/" : result;
	}

}
