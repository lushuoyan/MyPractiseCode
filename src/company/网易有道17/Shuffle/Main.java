package company.ÍøÒ×ÓÐµÀ17.Shuffle;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		while (times-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int len = 2 * n;
			int[] arr = new int[len + 1];
			for (int i = 1; i <= len; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < k; i++) {
				arr = shuffle(arr, n, len);
			}
			printArr(arr, len);
		}
		sc.close();
	}

	private static int[] shuffle(int[] arr, int n, int len) {
		int[] temp = new int[len + 1];
		int i = n, j = len, k = len;
		while (i > 0 || j > n) {
			temp[k--] = arr[j--];
			temp[k--] = arr[i--];
		}
		return temp;
	}

	private static void printArr(int[] arr, int len) {
		for (int i = 1; i < len; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println(arr[len]);
	}
}
