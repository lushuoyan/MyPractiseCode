package newcoder.BAT.string3;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��21��
 */
public class Translation{
	public static String stringTranslation(String A, int n, int len) {
		return A.toString().substring(len) + A.toString().substring(0,len);
	}
	
	public static void main(String[] args) {
		System.out.println(stringTranslation("ABCDEF",6,3));
	}
}
