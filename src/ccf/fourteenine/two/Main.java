package ccf.fourteenine.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(reader);
			int n = Integer.parseInt(input.readLine());
			int[][] array = new int[101][101];

			for (int i = 0; i < n; i++) {
				String[] tempArray = input.readLine().split(" ");
				int xStart = Integer.parseInt(tempArray[0]);
				int yStart = Integer.parseInt(tempArray[1]);
				int xEnd = Integer.parseInt(tempArray[2]);
				int yEnd = Integer.parseInt(tempArray[3]);
				for (int x = xStart; x < xEnd; x++) {
					for (int y = yStart; y < yEnd; y++) {
						array[x][y] = 1;
					}
				}
			}
			int result = 0;
			for (int x = 0; x < 101; x++) {
				for (int y = 0; y < 101; y++) {
					if (array[x][y] == 1) {
						result++;
					}
				}
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
