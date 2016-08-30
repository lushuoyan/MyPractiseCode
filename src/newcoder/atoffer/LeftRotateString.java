package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��30��
 */
public class LeftRotateString{
	public static String LeftRotateString(String str, int n) {
		if (n == 0 || str == null || str.length() == 1 || str.length() == 0) {
			return str;
		}
		if (n > str.length()) {
			n = n % str.length();
		}
		return str.substring(n) + str.substring(0, n);
	}

	public static void main(String[] args) {
		System.out.println(LeftRotateString("abcXYZdef", 13));
	}
}
