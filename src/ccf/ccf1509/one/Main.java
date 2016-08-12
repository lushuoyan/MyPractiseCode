package ccf.ccf1509.one;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			int result = 1;
			Scanner scan = new Scanner(System.in);
			int num = Integer.parseInt(scan.nextLine());
			String[] inputArray = scan.nextLine().split(" ");
			if(num==0){
				System.out.println(0);
				return ;
			}
			int cur = Integer.parseInt(inputArray[0]);
			for (int i = 1; i < num; i++) {
				int next = Integer.parseInt(inputArray[i]);
				if(next==cur){
					continue;
				}
				result++;
				cur = next;
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
