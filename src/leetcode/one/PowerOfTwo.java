package leetcode.one;

public class PowerOfTwo {

	/**
	 * 原理，如果一个数是2的n次方，那么这个数的二进制形式中只有1位为1，这样，减1之后，为1的那个位变为0，后面的位变为1，两个数相与结果为0；
	 * 如果数不是2的n次方，那么减1之后再相与，结果肯定不为0.
	 * 
	 * return n > 0 && ((n & (n - 1)) == 0 );
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 8;
		if (n == 0) {
			System.out.println(false);
		}

		if (n == 1 || n == 2) {
			System.out.println(true);
		}
		while (true) {
			double temp = n / 2.0;
			if ((temp - (int) temp != 0) || temp == 1) {
				System.out.println(false);
				break;
			}
			if (temp == 2) {
				System.out.println(true);
				break;
			}
			n = (int) temp;
		}

	}
}
