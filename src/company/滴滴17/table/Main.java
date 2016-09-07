package company.µÎµÎ17.table;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, num, cost;
		while (in.hasNextInt()) {
			n = in.nextInt();
			m = in.nextInt();
			int[] tab = new int[n];
			for (int i = 0; i < n; i++) {
				tab[i] = in.nextInt();
			}
			java.util.Arrays.sort(tab);
			Custom[] cums = new Custom[m];
			for (int i = 0; i < m; i++) {
				num = in.nextInt();
				cost = in.nextInt();
				Custom tmp = new Custom(num, cost);
				cums[i] = tmp;
			}
			java.util.Arrays.sort(cums);
			int res = 0;
			for (int i = m - 1, j = n - 1; i > -1 && j > -1; i--) {
				if (cums[i].num > tab[j]) {
					continue;
				}
				res += cums[i].cost;
				j--;
			}
			System.out.println(res);
		}
		in.close();
	}
}

class Custom implements Comparable<Custom> {
	int num;
	int cost;

	public Custom(int num, int cost) {
		this.num = num;
		this.cost = cost;
	}

	@Override
	public int compareTo(Custom o) {
		if (this.num < o.num) {
			return -1;
		} else if (this.num > o.num) {
			return 1;
		} else {
			if (this.cost > o.cost) {
				return 1;
			} else if (this.cost < o.cost) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}