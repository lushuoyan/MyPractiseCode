package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月30日
 */
public class Sum{
	public int Sum_Solution(int n) {
		int sum = (int) (Math.pow(n, 2) + n);
		return sum >> 1;
	}
}
