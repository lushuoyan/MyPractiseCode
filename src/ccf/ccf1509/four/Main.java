package ccf.ccf1509.four;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			String temp = scan.nextLine();
			int spaceP = temp.indexOf(" ");
			int N = Integer.parseInt(temp.substring(0, spaceP));
			int M = Integer.parseInt(temp.substring(spaceP + 1));
			String[] city = new String[N + 1];
			for (int i = 0; i < M; i++) {
				temp = scan.nextLine();
				spaceP = temp.indexOf(" ");
				int x = Integer.parseInt(temp.substring(0, spaceP));
				int y = Integer.parseInt(temp.substring(spaceP + 1));
				if (city[x] == null) {
					city[x] = String.valueOf(y);
				} else {
					city[x] += y;
				}
			}
			try {
				scan.close();
			} catch (Exception e) {
			}
			int[] DFN = new int[N + 1];
			int[] LOW = new int[N + 1];
			int[] sccno = new int[N + 1];
			temp = null;
			int[] result = new int[1];

			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 1; i < N + 1; i++) {
				if( DFN[i]==0){
					tarjan(result, stack, city, i, LOW, DFN, sccno);
				}
			}
			System.out.println(result[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int dfs_clock;
	static int scc_cnt;

	static void tarjan(int[] result, Stack<Integer> stack, String[] city,
			int cur, int[] LOW, int[] DFN, int[] sccno) {
		LOW[cur] = DFN[cur] = ++dfs_clock;
		stack.push(cur);
		if (city[cur] != null) {
			char[] array = city[cur].toCharArray();
			for (int i = 0; i < array.length; i++) {
				int temp = array[i] - '0';
				if (DFN[temp] == 0) {
					tarjan(result, stack, city, temp, LOW, DFN, sccno);
					LOW[cur] = Math.min(LOW[cur], LOW[temp]);
				} else if (sccno[temp] == 0) {
					LOW[cur] = Math.min(LOW[cur], DFN[temp]);
				}
			}
		}
		if (DFN[cur] == LOW[cur]) {
			int num = 0;
			scc_cnt++;
			while (true) {
				int temp = stack.pop();
				sccno[temp] = scc_cnt;
				num++;
				if (temp == cur) {
					if (num != 1) {
						result[0] += num;
					}
					break;
				}
			}
		}
	}
}
