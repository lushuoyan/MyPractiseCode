package newcoder.atoffer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��24��
 */
public class JumpFloorII{
	public int JumpFloorII(int target) {
		if (target <= 0) {
			return 0;
		} else if (target == 1) {
			return target;
		} else {
			return 2 * JumpFloorII(target - 1);
		}
	}
}
