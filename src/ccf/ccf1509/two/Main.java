package ccf.ccf1509.two;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int year = Integer.parseInt(scan.nextLine());
			int day = Integer.parseInt(scan.nextLine());
			Calendar time = Calendar.getInstance();
			time.clear();
			time.set(Calendar.YEAR, year);
			time.add(Calendar.DAY_OF_YEAR, day - 1);
			System.out.println(time.get(Calendar.MONTH)+1);
			System.out.println(time.get(Calendar.DAY_OF_MONTH));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
