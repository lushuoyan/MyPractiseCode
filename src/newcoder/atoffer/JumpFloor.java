package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��24��
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
