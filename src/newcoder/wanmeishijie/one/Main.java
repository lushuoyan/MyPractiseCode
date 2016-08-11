package newcoder.wanmeishijie.one;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String[] input = scan.nextLine().split(" ");
			if (input.length == 0) {
				break;
			}
			int len = 1;
			int[] tempArr = new int[input.length];
			tempArr[0] = Integer.parseInt(input[0]);
			for (int i = 1; i < input.length; i++) {
				int temp = Integer.parseInt(input[i]);
				if (temp > tempArr[len - 1]) {
					tempArr[len++] = temp;
				} else {
					int left = 0;
					int right = len - 1;
					while (left <= right) {
						int mid = (right + left) / 2;
						if (tempArr[mid] <= temp) {
							left = mid + 1;
						} else {
							right = mid - 1;
						}
					}
					tempArr[left] = temp;
				}
			}
			for (int i = 0; i < tempArr.length; i++) {
				if (tempArr[i] == 0) {
					break;
				}
				System.out.print(tempArr[i] + " ");
			}
		}
	}
}
