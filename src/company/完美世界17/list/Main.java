package company.完美世界17.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class SinglyLinkedList extends LinkedList<Integer> {

	private static final long serialVersionUID = 1L;
	LinkedList<Integer> list = new LinkedList<Integer>();

	public void addLast(int value) {
		this.list.addLast(value);
	}

	public void add(int index, int value) {
		if (index < 0 || index >= this.list.size()) {
			System.out.println("error");
			return;
		}
		this.list.add(index, value);
	}

	public void delete(int index) {
		if (index < 0 || index >= this.list.size()) {
			System.out.println("error");
			return;
		}
		this.list.remove(index);
	}

	public void print() {
		Iterator<Integer> ite = this.list.iterator();
		StringBuilder str = new StringBuilder();
		while (ite.hasNext()) {
			str.append(ite.next() + " ");
		}
		if (str.length() > 0) {
			System.out.println(str.substring(0, str.length() - 1));
		} else {
			System.out.println();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		while (scan.hasNextLine()) {
			String[] input = scan.nextLine().split(" ");
			if (input.length == 1) {
				list.delete(Integer.parseInt(input[0]));
				list.print();
				continue;
			}
			if (input.length == 2) {
				list.add(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
				list.print();
				continue;
			}
			int ind = Integer.parseInt(input[0]);
			for (int i = 1; i <= ind; i++) {
				list.addLast(Integer.parseInt(input[i]));
			}
			if (input.length - ind > 2) {
				ind++;
				while (input.length - ind > 2) {
					list.add(Integer.parseInt(input[ind++]),
							Integer.parseInt(input[ind++]));
				}
			}
			if (input.length - ind == 0) {
				list.print();
				continue;
			} else if (input.length - ind == 1) {
				list.delete(Integer.parseInt(input[ind]));
				list.print();
			}
		}
		scan.close();
	}
}
