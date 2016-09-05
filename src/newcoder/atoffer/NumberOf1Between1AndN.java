package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月25日
 */
public class NumberOf1Between1AndN {
	public int NumberOf1Between1AndN_Solution(int n) {
		if (n < 1) {
			return 0;
		}
		int len = String.valueOf(n).length();
		if (len == 1) {
			return 1;
		}
		int tmp1 = powerBaseOf10(len - 1);
		int first = n / tmp1;
		int firstOneNum = first == 1 ? n % tmp1 + 1 : tmp1;
		int otherOneNum = first * (len - 1) * (tmp1 / 10);
		return firstOneNum + otherOneNum
				+ NumberOf1Between1AndN_Solution(n % tmp1);
	}

	private int powerBaseOf10(int base) {
		return (int) Math.pow(10, base);
	}

	public int getLenOfNum(int num) {
		int len = 0;
		while (num != 0) {
			len++;
			num /= 10;
		}
		return len;
	}

	public static void main(String[] args) {
		NumberOf1Between1AndN test = new NumberOf1Between1AndN();
		System.out.println(test.NumberOf1Between1AndN_Solution(10));
	}
}
