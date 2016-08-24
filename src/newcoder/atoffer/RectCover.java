package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月24日
 */
public class RectCover{
	public int RectCover(int target) {
		if (target == 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		int fn_1 = 2, fn_2 = 1;
		int fn = fn_1;
		for (int i = 3; i <= target; i++) {
			fn = fn_1 + fn_2;
			fn_2 = fn_1;
			fn_1 = fn;
		}
		return fn;
	}
}
