package company.¾©¶«17.climb;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int day = sc.nextInt();
			int len = sc.nextInt();
			int[][] arr = new int[len][2];
			for (int i = 0; i < len; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			if (day == 1) {
				if (len == 0) {
					System.out.println(1);
				} else {
					System.out.println(arr[0][1]);
				}
				continue;
			}
			int res = 1;
			int maxHight = Math.max(arr[0][1], arr[0][0]);
			for (int i = 0; i < arr.length - 1; i++) {
				int maxH = Math.max(arr[i][1], arr[i + 1][1]);
				int minH = Math.min(arr[i][1], arr[i + 1][1]);
				int dayDis = arr[i + 1][0] - arr[i][0];
				int highDis = maxH - minH;
				if (dayDis < highDis) {
					res = -1;
					break;
				}
				if (arr[i][1] == arr[i + 1][1]) {
					maxHight = Math.max(arr[i][1] + dayDis / 2, maxHight);
				} else if (arr[i][1] > arr[i + 1][1]) {
					maxHight = Math.max((dayDis - (arr[i][1] - arr[i + 1][1]))
							/ 2 + arr[i][1], maxHight);
				} else {
					maxHight = Math.max((dayDis - (arr[i + 1][1] - arr[i][1]))
							/ 2 + arr[i][1], maxHight);
				}
			}
			maxHight = Math.max(day - arr[len - 1][0] + arr[len - 1][1],
					maxHight);
			if (res == -1) {
				System.out.println("IMPOSSIBLE");
			} else {
				System.out.println(maxHight);
			}
		}
	}
}
