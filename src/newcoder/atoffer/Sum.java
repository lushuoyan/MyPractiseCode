package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��30��
 */
public class Sum{
	public int Sum_Solution(int n) {
		int sum = (int) (Math.pow(n, 2) + n);
		return sum >> 1;
	}
}
