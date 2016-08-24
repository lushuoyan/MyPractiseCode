package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月24日
 */
public class NumberOf1{
	public static int NumberOf1(int n) {
		int res = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				res++;
			}
			n = n >>> 1;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(NumberOf1(-1));
	}
}
