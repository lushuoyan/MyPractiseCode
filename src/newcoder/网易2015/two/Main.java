package newcoder.Эјвз2015.two;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();
		String input = scan.nextLine();
		while (input != null && input.length()>9) {
			arrayList.add(input);
			input = scan.nextLine();
		}
		for (int j = 0; j < arrayList.size(); j++) {
			String[] array = arrayList.get(j).split(" ");
			int dis = Integer.parseInt(array[0]);
			int result = 0;
			int tarX = Integer.parseInt(array[7]);
			int tarY = Integer.parseInt(array[8]);
			for (int i = 1; i < 7; i++) {
				int x = Integer.parseInt(array[i++]);
				int y = Integer.parseInt(array[i]);
				int temp1 = (int) Math.pow((x > tarX ? x - tarX : tarX - x), 2);
				int temp2 = (int) Math.pow((y > tarY ? y - tarY : tarY - y), 2);
				int temp3 = (int) Math.sqrt(temp1 + temp2);
				if (temp3 < dis) {
					result++;
				}
			}
			scan.close();
			System.out.println(result + "x");
		}

	}
}
