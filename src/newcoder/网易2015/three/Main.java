package newcoder.Эјвз2015.three;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");
		int N = Integer.parseInt(array[0]);
		int M = Integer.parseInt(array[1]);
		int K = Integer.parseInt(array[2]);
		int[][] glass = new int[N + 1][M + 1];
		for (int i = 0; i < K; i++) {
			String temp = scan.nextLine();
			int spaceP = temp.indexOf(" ");
			int x = Integer.parseInt(temp.substring(0, spaceP));
			int y = Integer.parseInt(temp.substring(spaceP + 1));
			glass[x][y] = 1;
		}
		
	}
}
