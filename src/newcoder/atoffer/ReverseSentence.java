package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月30日
 */
public class ReverseSentence{
	public static String ReverseSentence(String str) {
		StringBuilder res = new StringBuilder(str.length());
		StringBuilder temp = new StringBuilder();
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i > -1; i--) {
			if (arr[i] == ' ') {
				res.append(temp.reverse() + " ");
				temp.setLength(0);
			} else {
				temp.append(arr[i]);
			}
		}
		if (temp.length() != 0) {
			res.append(temp.reverse());
		}
		return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseSentence("student.  a am I  "));
	}
}
