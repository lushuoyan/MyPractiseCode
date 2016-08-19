package company.ÍøÒ×ÓÐµÀ17.GenerateQueue;

import java.util.LinkedList;
import java.util.Scanner;

public class MainOld{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		while (times-- > 0) {
			int n = scan.nextInt();
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(n);
			while (n-- > 1) {
				list.addFirst(n);
				int temp = list.getLast();
				list.removeLast();
				list.addFirst(temp);
			}
			printArr(list);
		}
		scan.close();
	}

	private static void printArr(LinkedList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.getLast());
	}
}
