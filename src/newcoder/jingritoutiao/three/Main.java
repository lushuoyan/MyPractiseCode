package newcoder.jingritoutiao.three;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] tempArr = scan.nextLine().split(" ");
		int n = Integer.parseInt(tempArr[0]);
		int s = Integer.parseInt(tempArr[1]);
		int l = Integer.parseInt(tempArr[2]);
		int conN = 0;
		int conP = 0;
		while (true) {
			if (conP + s <= l) {
				conN++;
				conP += (s + 1);
			} else {
				if (conN == 13) {
					conN--;
				}
				break;
			}
		}
		if(n % conN==0){
			System.out.println(n / conN);
		}else{
			System.out.println(n / conN + 1);
		}
	}
}
