package leetcode.one;

public class PowerOfTwo {

	/**
	 * ԭ�����һ������2��n�η�����ô������Ķ�������ʽ��ֻ��1λΪ1����������1֮��Ϊ1���Ǹ�λ��Ϊ0�������λ��Ϊ1��������������Ϊ0��
	 * ���������2��n�η�����ô��1֮�������룬����϶���Ϊ0.
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
