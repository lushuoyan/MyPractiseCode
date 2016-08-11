package newcoder.BAT.string3;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月21日
 */
public class Reverse{
	public String reverseSentence(String A, int n) {
		StringBuffer str = new StringBuffer();
		StringBuffer word = new StringBuffer();
		for (int i = n - 1; i > -1; i--) {
			if (A.charAt(i) != ' ') {
				word.append(A.charAt(i));
				continue;
			}
			str.append(" " + word.reverse());
			word.setLength(0);
		}
		str.append(" " + word.reverse());
		return str.substring(1);
	}
}
