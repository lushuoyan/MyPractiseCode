package newcoder.jingritoutiao.two;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder res = new StringBuilder(scan.nextLine());
		int time = Integer.parseInt(scan.nextLine());
		while (time-- > 0) {
			String[] tempArr = scan.nextLine().split(" ");
			int start = Integer.parseInt(tempArr[0]);
			int end = Integer.parseInt(tempArr[1]) + start;
			res.append((new StringBuilder(res.substring(start, end))).reverse());
		}
		System.out.println(res);
	}
}
