package newcoder.BAT.dichotomy6;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月4日
 */
public class QuickPower{
	public int getPower(int k, int N) {
		if (N == 0) {
			return 1;
		}
		if (N == 1) {
			return k;
		}
		if (N % 2 == 0) {
			long tmp = getPower(k, N / 2);
			tmp = (tmp * tmp) % 1000000007;
			return (int) tmp;
		} else {
			long tmp = getPower(k, (N - 1) / 2);
			tmp = (tmp * tmp) % 1000000007;
			return (int) ((tmp * k) % 1000000007);
		}
	}
}
