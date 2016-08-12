package ccf.ccf1512.»­Í¼3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cavasSizeAndOperationCount = sc.nextLine();
		String[] m_n_q_Arr = cavasSizeAndOperationCount.split(" ");
		int m = Integer.parseInt(m_n_q_Arr[0]);
		int n = Integer.parseInt(m_n_q_Arr[1]);
		int q = Integer.parseInt(m_n_q_Arr[2]);
		char[][] canvas = new char[n][m];
		for (int i = 0; i < canvas.length; i++) {
			for (int j = 0; j < canvas[0].length; j++) {
				canvas[i][j] = '.';
			}
		}
		for (int k = 0; k < q; k++) {
			String operationStr = sc.nextLine();
			String[] operationArr = operationStr.split(" ");
			if (Integer.parseInt(operationArr[0]) == 0) {
				drawLine(canvas, Integer.parseInt(operationArr[1]),
						Integer.parseInt(operationArr[2]),
						Integer.parseInt(operationArr[3]),
						Integer.parseInt(operationArr[4]));
			} else {
				fillCanvas(n, m, canvas,
						n - 1 - Integer.parseInt(operationArr[2]),
						Integer.parseInt(operationArr[1]),
						operationArr[3].charAt(0));
			}
		}
		for (int i = 0; i < canvas.length; i++) {
			for (int j = 0; j < canvas[0].length; j++) {
				System.out.print(canvas[i][j]);
			}
			System.out.println();
		}
	}

	private static void drawLine(char[][] canvas, int x1, int y1, int x2, int y2) {
		if (x1 == x2) {
			if (y2 < y1) {
				int temp = y2;
				y2 = y1;
				y1 = temp;
			}
			for (int i = canvas.length - 1 - y2; i <= canvas.length - 1 - y1; i++) {
				if (canvas[i][x1] == '-') {
					canvas[i][x1] = '+';
				} else if(canvas[i][x1] == '+'){
					continue;
				} else {
					canvas[i][x1] = '|';
				}
			}
		} else if (y1 == y2) {
			if (x2 < x1) {
				int temp = x2;
				x2 = x1;
				x1 = temp;
			}
			for (int i = x1; i <= x2; i++) {
				if (canvas[canvas.length - 1 - y2][i] == '|') {
					canvas[canvas.length - 1 - y2][i] = '+';
				} else if(canvas[canvas.length - 1 - y2][i] == '+'){
					continue;
				}else{
					canvas[canvas.length - 1 - y2][i] = '-';
				}
			}
		}
	}

	private static void fillCanvas(int n, int m, char[][] canvas, int curX,
			int curY, char fillChar) {
		if (canvas[curX][curY] == '-' || canvas[curX][curY] == '|') {
			return;
		}
		canvas[curX][curY] = fillChar;
		if (curX > 0 && canvas[curX - 1][curY] != '-'
				&& canvas[curX - 1][curY] != '|'
				&& canvas[curX - 1][curY] != '+'
				&& canvas[curX - 1][curY] != fillChar) {
			fillCanvas(n, m, canvas, curX - 1, curY, fillChar);
		}
		if (curY > 0 && canvas[curX][curY - 1] != '-'
				&& canvas[curX][curY - 1] != '|'
				&& canvas[curX][curY - 1] != '+'
				&& canvas[curX][curY - 1] != fillChar) {
			fillCanvas(n, m, canvas, curX, curY - 1, fillChar);
		}
		if (curX + 1 < n && canvas[curX + 1][curY] != '-'
				&& canvas[curX + 1][curY] != '|'
				&& canvas[curX + 1][curY] != '+'
				&& canvas[curX + 1][curY] != fillChar) {
			fillCanvas(n, m, canvas, curX + 1, curY, fillChar);
		}
		if (curY + 1 < m && canvas[curX][curY + 1] != '-'
				&& canvas[curX][curY + 1] != '|'
				&& canvas[curX][curY + 1] != '+'
				&& canvas[curX][curY + 1] != fillChar) {
			fillCanvas(n, m, canvas, curX, curY + 1, fillChar);
		}
	}
}
