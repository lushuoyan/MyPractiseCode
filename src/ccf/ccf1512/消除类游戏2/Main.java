package ccf.ccf1512.Ïû³ıÀàÓÎÏ·2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] firstArr = scan.nextLine().split(" ");
		int n = Integer.parseInt(firstArr[0]);
		int m = Integer.parseInt(firstArr[1]);
		int[][] input = new int[n][m];
		boolean[][] result = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				input[i][j] = scan.nextInt();
			}
		}
		if (m > 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m - 2; j++) {
					if (input[i][j] == input[i][j + 1]
							&& input[i][j + 1] == input[i][j + 2]) {
						result[i][j] = true;
						result[i][j + 1] = true;
						result[i][j + 2] = true;
					}
				}
			}
		}
		if (n > 2) {
			for (int j = 0; j < m; j++) {
				for (int i = 0; i < n - 2; i++) {
					if (input[i + 1][j] == input[i][j]
							&& input[i + 1][j] == input[i + 2][j]) {
						result[i][j] = true;
						result[i + 1][j] = true;
						result[i + 2][j] = true;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 1; j++) {
				if (result[i][j]) {
					System.out.print("0 ");
				} else {
					System.out.print(input[i][j] + " ");
				}
			}
			if (result[i][m - 1]) {
				System.out.println("0");
			} else {
				System.out.println(input[i][m - 1]);
			}
		}
	}
}
