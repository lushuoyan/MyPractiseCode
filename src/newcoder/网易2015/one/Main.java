package newcoder.Эјвз2015.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			ArrayList<String> arrayList = new ArrayList<String>();
			while (scan.hasNext()) {
				arrayList.add(scan.nextLine());
				String temp = scan.nextLine();
				int spaceP = temp.indexOf(" ");
				int num = Integer.parseInt(temp.substring(0, spaceP));
				int result = Integer.parseInt(temp.substring(spaceP + 1));
				temp = scan.nextLine();
				String[] array = temp.split(" ");
				temp = null;
				for (int i = 0; i < num; i++) {
					int mon = Integer.valueOf(array[i]);
					if (mon <= result) {
						result += mon;
					} else {
						result += gcd(mon, result);
					}
				}
				System.out.println(result);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static int gcd(int a, int b) {
		int c = a % b;
		while (c != 0) {
			a = b;
			b = c;
			c = a % b;
		}
		return b;
	}
}
