package ccf.fourteentwelf.four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			String[] firstArray = reader.readLine().split(" ");
			int n = Integer.parseInt(firstArray[0]);
			int lineNum = Integer.parseInt(firstArray[1]);
			int[][] cornField = new int[n + 1][n + 1];
			for (int i = 1; i < n + 1; i++) {
				for (int j = 1; j < n + 1; j++) {
					cornField[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i = 0; i < lineNum; i++) {
				String[] tempArray = reader.readLine().split(" ");
				cornField[Integer.parseInt(tempArray[0])][Integer
						.parseInt(tempArray[1])] = Integer
						.parseInt(tempArray[2]);
				cornField[Integer.parseInt(tempArray[1])][Integer
						.parseInt(tempArray[0])] = Integer
						.parseInt(tempArray[2]);
			}
			int result = 0;
			boolean[] checked = new boolean[n + 1];
			int[] lowerW = new int[n + 1];
			int[] edge = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				lowerW[i] = cornField[1][i];
				edge[i] = 1;
				checked[i] = false;
			}

			for (int i = 1; i <= n; i++) {
				int min = Integer.MAX_VALUE;
				int j = 1;
				for (int k = 2; k <= n; k++) {
					if (lowerW[k] < min && (!checked[k])) {
						min = lowerW[k];
						j = k;
					}
				}
				if (i < n) {
					result += min;
				}
				checked[j] = true;
				for (int k = 2; k <= n; k++) {
					if ((cornField[j][k] < lowerW[k]) && (!checked[k])) {
						lowerW[k] = cornField[j][k];
						edge[k] = j;
					}
				}
			}

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
