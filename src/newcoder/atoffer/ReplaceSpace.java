package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��23��
 */
public class ReplaceSpace{
	public String replaceSpace(StringBuffer str) {
		if (str == null) {
			return null;
		}
		StringBuilder newStr = new StringBuilder();
		char[] arr = str.toString().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				newStr.append("%20");
			} else {
				newStr.append(arr[i]);
			}
		}
		return newStr.toString();
	}
}
