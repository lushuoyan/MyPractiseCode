package ccf.ccf1412.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	/*
	 * ��ͼ�������㷨�У���Ҫ��һ�������ķ��ξ������Z����ɨ��(Zigzag Scan)�� ����һ��n��n�ľ���Z����ɨ��Ĺ�������ͼ��ʾ��
	 * �����������4��4�ľ��� ����1 5 3 9 ����3 7 5 6 ����9 4 6 4 ����7 3 1 3
	 * �����������Z����ɨ���õ�����Ϊ16�����У� ����1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3
	 * ������ʵ��һ��Z����ɨ��ĳ��򣬸���һ��n��n�ľ������������������Z����ɨ��Ľ����
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
