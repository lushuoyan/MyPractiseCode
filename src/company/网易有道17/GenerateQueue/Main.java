package company.ÍøÒ×ÓÐµÀ17.GenerateQueue;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		while (times-- > 0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			int k = 1;
			int cnt = 0;
			while (k <= n) {
				for (int j = 0; j < n; j++) {
					if (arr[j] == 0 && ++cnt % 2 == 0) {
						arr[j] = k++;
					}
				}
			}
			printArr(arr);
		}
		scan.close();
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[arr.length - 1]);
	}
}
