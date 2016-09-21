package leetcode.one;


public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-2147483648));
System.out.println(reverse(-32 		 ));
	}

	public static int reverse(int x) {
		StringBuffer temp = new StringBuffer();
		boolean negative = false;
		if (x < 0) {
			negative = true;
			x = 0-x;
		}
		temp.append(String.valueOf(x));
		String result = temp.reverse().toString();
		try {
			return negative ? (int)Integer.parseInt(result) * -1
					: (int)Integer.parseInt(result);
		} catch (NumberFormatException e) {
			return -1;
		}
	}
}
