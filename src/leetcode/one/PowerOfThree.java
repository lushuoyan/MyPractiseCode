package leetcode.one;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 8;
		if (n == 0) {
			System.out.println(false);
		}

		if (n == 1 || n == 3) {
			System.out.println(true);
		}
		while (true) {
			double temp = n / 3.0;
			if ((temp - (int) temp != 0) || temp == 1) {
				System.out.println(false);
				break;
			}
			if (temp == 3) {
				System.out.println(true);
				break;
			}
			n = (int) temp;
		}
	}

}
