package ccf.ccf1512.ËÍ»õ4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] firArr = sc.nextLine().split(" ");
		int n = Integer.parseInt(firArr[0]);
		int[][] x = new int[n + 1][n + 1];
		int[] odd = new int[n + 1];
		int way = Integer.parseInt(firArr[1]);
		int start = Integer.MAX_VALUE;
		for (int i = 0; i < way; i++) {
			String[] temp = sc.nextLine().split(" ");
			int temp0 = Integer.parseInt(temp[0]);
			int temp1 = Integer.parseInt(temp[1]);
			odd[temp0]++;
			odd[temp1]++;
			x[temp0][temp1] = 1;
			x[temp1][temp0] = 1;
			temp = null;
		}
		int oddNum = 0;
		int end = 0;
		for (int i = 1; i < n + 1; i++) {
			if (odd[i] % 2 == 1) {
				if (start > i) {
					start = i;
				} else {
					end = i;
				}
				oddNum++;
			}
		}
		if (oddNum != 2) {
			System.out.println(-1);
			return;
		}
		int cur = start;
		System.out.print(start+" ");
		w:while (true) {
			if (way == 0) {
				break;
			}
			for (int i = 1; i < n + 1; i++) {
				if (x[cur][i] == 1) {
					if (i == end && odd[end] == 1 && way != 1) {
						continue;
					}
					System.out.print(i+" ");
					odd[cur]--;
					odd[i]--;
					x[cur][i] = 0;
					x[i][cur] = 0;
					cur = i;
					way--;
					continue w;
				}
			}
		}
		System.out.println();
	}
}
