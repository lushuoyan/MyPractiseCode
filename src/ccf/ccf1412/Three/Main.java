package ccf.ccf1412.Three;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StockArray {
	String SBC;
	float price;
	int number;
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		StockArray[] ss = new StockArray[5002];
		for (int i = 0; i < 5002; i++) {
			ss[i] = new StockArray();
		}
		int num = 1;
		while (scanner.hasNextLine()) {
			String a = scanner.nextLine();
			if (a.trim().length() == 0) {
				break;
			}
			String[] b = a.split(" ");
			ss[num].SBC = b[0];
			if (ss[num].SBC.equals("buy") || ss[num].SBC.equals("sell")) {
				ss[num].price = Float.parseFloat(b[1]);
				ss[num].number = Integer.parseInt(b[2]);
			} else if (ss[num].SBC.equals("cancel")) {
				ss[(int) Long.parseLong(b[1])].SBC = "CANCEL";
			}
			num++;
		}
		scanner.close();
		StockArray[] n1 = new StockArray[num];
		for (int i = 0; i < num; i++) {
			n1[i] = new StockArray();
		}
		StockArray[] n2 = new StockArray[num];
		for (int i = 0; i < num; i++) {
			n2[i] = new StockArray();
		}
		int num1 = 0;
		int num2 = 0;
		long ans_num = 0;
		float ans_price = 0;

		for (int i = 1; i < num; i++) {
			if (ss[i].SBC.equals("buy")) {
				n1[num1].price = ss[i].price;
				n1[num1].number = ss[i].number;
				num1++;
			}
			if (ss[i].SBC.equals("sell")) {
				n2[num2].price = ss[i].price;
				n2[num2].number = ss[i].number;
				num2++;
			}
		}

		Arrays.sort(n1, 0, num1, new MyComprator1());
		Arrays.sort(n2, 0, num2, new MyComprator2());

		long sum1 = 0, sum2;
		float p;
		for (int i = 0; i < num1; i++) {
			p = n1[i].price;
			sum1 += n1[i].number;
			sum2 = 0;
			for (int j = 0; j < num2; j++) {
				if (n2[j].price > n1[i].price)
					break;
				sum2 += n2[j].number;
			}
			long min_sum = Math.min(sum1, sum2);
			if (ans_num < min_sum) {
				ans_num = min_sum;
				ans_price = p;
			}
		}
		System.out.printf("%.2f", ans_price);
		System.out.printf(" " + ans_num);
	}
}

class MyComprator1 implements Comparator<StockArray> {
	public int compare(StockArray s1, StockArray s2) {
		if (s1.price != s2.price) {
			return s2.price > s1.price ? 1 : -1;
		} else {
			return s2.number > s1.number ? 1 : -1;
		}
	}
}

class MyComprator2 implements Comparator<StockArray> {
	public int compare(StockArray s1, StockArray s2) {
		if (s1.price != s2.price) {
			return s1.price > s2.price ? 1 : -1;
		} else {
			return s1.number > s2.number ? 1 : -1;
		}
	}
}
