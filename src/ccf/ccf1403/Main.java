package ccf.ccf1403;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	char guiZe[];
	int n;
	String order[];
	List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		inial();
		disPlay();
	}

	public void inial() {
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		guiZe = new char[temp.length()];
		for (int i = 0; i < guiZe.length; i++) {
			guiZe[i] = temp.charAt(i);
		}
		n = sc.nextInt();
		sc.nextLine();
		order = new String[n];
		for (int i = 0; i < n; i++) {
			order[i] = sc.nextLine();
		}
		sc.close();
	}

	public int getState(String s) {
		if (s.length() != 2 || s.charAt(0) != '-') {
			return 0;
		}
		for (int i = 0; i < guiZe.length; i++) {
			if (s.charAt(1) == guiZe[i]) {
				if (i == guiZe.length - 1 || guiZe[i + 1] != ':') {
					return 1;
				}
				return 2;
			}
		}
		return 0;
	}

	public void disPlay() {
		for (int i = 0; i < order.length; i++) {
			list.clear();
			String temp[] = order[i].split(" ");
			for (int j = 1; j < temp.length; j++) {
				if (getState(temp[j]) == 0) {
					break;
				} else if (getState(temp[j]) == 1) {
					if (!list.contains(temp[j])) {
						list.add(temp[j]);
					}
				} else {
					if (j == temp.length - 1) {
						break;
					}
					if (list.contains(temp[j])) {
						list.set(list.indexOf(temp[j]) + 1, temp[j + 1]);
						j++;
					} else {
						list.add(temp[j]);
						list.add(temp[j + 1]);
						j++;
					}
				}
			}
			sort(list);
			System.out.print("Case " + (i + 1) + ": ");
			for (int j = 0; j < list.size(); j++)
				System.out.print(list.get(j) + " ");
			System.out.println();
		}
	}

	public void sort(List<String> list) {
		for (int j = 0; j < list.size(); j++) {
			if (getState(list.get(j)) == 2) {
				String s1 = list.get(j);
				String s2 = list.get(j + 1);
				list.set(j, s1 + " " + s2);
				list.remove(j + 1);
			}
		}
		for (int j = 0; j < list.size(); j++) {
			for (int k = 0; k < list.size() - 1 - j; k++) {
				if (list.get(k).charAt(1) > list.get(k + 1).charAt(1)) {
					String temp_s = list.get(k);
					list.set(k, list.get(k + 1));
					list.set(k + 1, temp_s);
				}
			}
		}
	}
}