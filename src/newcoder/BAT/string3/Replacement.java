package newcoder.BAT.string3;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��21��
 */
public class Replacement{
	public static String replaceSpace(String iniString, int length) {
		return iniString.replaceAll(" ", "%20");
	}

	public static void main(String[] args) {
		System.out.println(replaceSpace("adasd  asdf",12));
	}
}
