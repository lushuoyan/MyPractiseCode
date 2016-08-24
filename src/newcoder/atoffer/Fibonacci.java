package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月23日
 */
public class Fibonacci{
	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int first = 1;
		int second = 1;
		while (n-- > 2) {
			int temp = second + first;
			first = second;
			second = temp;
		}
		return second;
	}
}
