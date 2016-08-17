import java.util.Date;

public class Main{
	public static void main(String[] args) {
		Date start = new Date();
		for (int i = 0; i < 100; i++) {
			(new StringBuffer(String.valueOf(Integer.MAX_VALUE))).reverse()
				.toString();
		}
		Date end = new Date();
		System.out.println(end.getTime() - start.getTime());
		for (int i = 0; i < 100; i++) {
			(new StringBuffer(String.valueOf(Integer.MAX_VALUE))).reverse()
				.toString();
		}
		System.out.println((new Date()).getTime() - end.getTime());
	}

	public static boolean isP(int x) {
		return x == Integer.valueOf((new StringBuffer(String.valueOf(x))).reverse()
			.toString());
	}
}