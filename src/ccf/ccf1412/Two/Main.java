package ccf.ccf1412.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	/*
	 * 在图像编码的算法中，需要将一个给定的方形矩阵进行Z字形扫描(Zigzag Scan)。 给定一个n×n的矩阵，Z字形扫描的过程如下图所示：
	 * 　对于下面的4×4的矩阵， 　　1 5 3 9 　　3 7 5 6 　　9 4 6 4 　　7 3 1 3
	 * 　　对其进行Z字形扫描后得到长度为16的序列： 　　1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3
	 * 　　请实现一个Z字形扫描的程序，给定一个n×n的矩阵，输出对这个矩阵进行Z字形扫描的结果。
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			int n = Integer.parseInt(reader.readLine());
			int[][] matrix = new int[n][n];
			for (int i = 0; i < n; i++) {
				String inputSting = reader.readLine();
				for (int j = 0; j < n - 1; j++) {
					int spacePositon = inputSting.indexOf(" ");
					matrix[i][j] = Integer.parseInt(inputSting.substring(0,
							spacePositon));
					inputSting = inputSting
							.substring(inputSting.indexOf(" ") + 1);
				}
				matrix[i][n - 1] = Integer.parseInt(inputSting);
			}

			int direction = 0;
			boolean onLine = false;
			for (int i = 0; i < n;) {
				for (int j = 0; j < n;) {
					if (i == n - 1 && j == n - 1) {
						i++;
						j++;
						break;
					}
					System.out.print(matrix[i][j] + " ");
					if ((i == 0 && j % 2 == 0)&&j!=n-1) {
						j++;
						direction = 1;
						onLine = true;
					}
					if (((i == n - 1 && j % 2 == 0)&&n%2==0)||((i == n - 1 && j % 2 == 1)&&n % 2 == 1)){
						j++;
						direction = 0;
						onLine = true;
					}
					if (j == 0 && i % 2 == 1) {
						i++;
						direction = 0;
						onLine = true;
					}
					if (((j == n - 1 && i % 2 == 1) && n % 2 == 0)
							|| ((j == n - 1 && i % 2 == 0) && n % 2 == 1)) {
						if (i != n - 1) {
							i++;
							direction = 1;
							onLine = true;
						}
					}
					if(direction==1&&onLine == false){
						i++;
						j--;
						
					}
					if(direction==0&&onLine == false){
						i--;
						j++;
					}
					if(onLine == true){
						onLine = false;
					}
					
				}
			}
			System.out.println(matrix[n - 1][n - 1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
