package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月24日
 */
public class JumpFloor{
	public int JumpFloor(int target) {
		if (target == 0) {
			return 0;
		}
		if (target == 1 || target == 2) {
			return target;
		}
		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}
