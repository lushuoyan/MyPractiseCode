package ccf.ccf1512.数位之和1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int result = 0;
		char[] inputAr = input.toCharArray();
		for (int i = 0; i < inputAr.length; i++) {
			result += (inputAr[i]-'0');
		}
		System.out.println(result);
	}
}
