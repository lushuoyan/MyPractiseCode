package ccf.ccf1503.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			reader = new BufferedReader(input);
			String firstLine = reader.readLine();
			String[] fisrtArray = firstLine.split(" ");
			int n = Integer.parseInt(fisrtArray[0]);
			int m = Integer.parseInt(fisrtArray[1]);
			int[][] inPutMax = new int[n][m];
			for (int i = 0; i < n; i++) {
				String tempLine = reader.readLine();
				String[] tempArray = tempLine.split(" ");
				for (int j = 0; j < m; j++) {
					inPutMax[i][j] = Integer.parseInt(tempArray[j]);
				}
			}
			for (int j = m - 1; j > -1; j--) {
				String outPutString = "";
				for (int i = 0; i < n; i++) {
					if (i != 0) {
						outPutString = outPutString  + " " + inPutMax[i][j];
					} else {
						outPutString =  String.valueOf(inPutMax[i][j]) ;
					}
				}
				System.out.println(outPutString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
