package company.完美世界17.twinprimes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> primes = new LinkedList<Integer>();
		List<String> res = new ArrayList<String>();
		init(primes);
		while (scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			res.clear();
			int i = 0;
			while (true) {
				if (primes.get(i) > m) {
					break;
				}
				i++;
			}
			int j = i + 1;
			while (j < primes.size() && primes.get(j) < n) {
				if (primes.get(j) - primes.get(i) == 2) {
					res.add(primes.get(i) + " " + primes.get(j));
				}
				i++;
				j++;
			}
			if (res.size() == 0) {
				System.out.println("no");
			} else {
				for (i = 0; i < res.size() - 1; i++) {
					System.out.print(res.get(i) + " ");
				}
				System.out.println(res.get(res.size() - 1));
			}
		}
		scan.close();
	}

	private static void init(LinkedList<Integer> primes) {
		primes.add(101);
		primes.add(103);
		primes.add(107);
		primes.add(109);
		primes.add(137);
		primes.add(139);
		primes.add(149);
		primes.add(151);
		primes.add(179);
		primes.add(181);
		primes.add(191);
		primes.add(193);
		primes.add(197);
		primes.add(199);
		primes.add(227);
		primes.add(229);
		primes.add(239);
		primes.add(241);
		primes.add(269);
		primes.add(271);
		primes.add(281);
		primes.add(283);
		primes.add(311);
		primes.add(313);
		primes.add(347);
		primes.add(349);
		primes.add(419);
		primes.add(421);
		primes.add(431);
		primes.add(433);
		primes.add(461);
		primes.add(463);
		primes.add(521);
		primes.add(523);
		primes.add(569);
		primes.add(571);
		primes.add(599);
		primes.add(601);
		primes.add(617);
		primes.add(619);
		primes.add(641);
		primes.add(643);
		primes.add(659);
		primes.add(661);
		primes.add(809);
		primes.add(811);
		primes.add(821);
		primes.add(823);
		primes.add(827);
		primes.add(829);
		primes.add(857);
		primes.add(859);
		primes.add(881);
		primes.add(883);
	}

	private static boolean divisible(int n, LinkedList<Integer> primes) {
		if (n < primes.getLast()) {
			return primes.contains(n);
		}
		for (Integer prime : primes) {
			if (n % prime == 0) {
				return true;
			}
		}
		return false;
	}
}
