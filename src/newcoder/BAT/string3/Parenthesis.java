package newcoder.BAT.string3;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月21日
 */
public class Parenthesis{
	public static boolean chkParenthesis(String A, int n) {
		int right = 0;
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '(') {
				right++;
				continue;
			}
			if (A.charAt(i) == ')') {
				if (right-- == 0) {
					return false;
				}
				continue;
			}
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(chkParenthesis("()()(((())))", 12));
	}
}
