package leetcode.one;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月5日
 */
public class ReverseWordsInAString{
	public static String reverseWords(String s) {
		if (s == null || s.equals("")) {
			return s;
		}
		String[] sArr = s.split(" ");
		StringBuffer res = new StringBuffer();
		for (int i = sArr.length - 1; i > -1; i--) {
			if (sArr[i].equals("")) {
				continue;
			}
			res.append(sArr[i] + " ");
		}
		if (res.length() == 0) {
			return "";
		}
		return res.substring(0, res.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(reverseWords(" 1"));
	}
}
