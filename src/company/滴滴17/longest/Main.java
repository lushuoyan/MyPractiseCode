package company.µÎµÎ17.longest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		long max,res,tmp;
		while (in.hasNextInt()) {
			res = Integer.MIN_VALUE;
			max = 0;
			n = in.nextInt();
			for (int i = 0; i < n; i++) {
				tmp = in.nextLong();
				max += tmp;
				if (res < max) {
					res = max;
				}
				if (max < 0) {
					max = 0;
				}
			}
			System.out.println(res);
		}
		in.close();
	}
}
