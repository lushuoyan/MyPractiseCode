import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int size = in.nextInt();
			for (int i = 0; i < size; i++) {
				int len = in.nextInt();
				int[] data = new int[len];
				for (int j = 0; j < len; j++) {
					data[j] = in.nextInt();
				}
				getMaxIncrementSequence(data, len);
			}
		}
		in.close();
	}

	public static void getMaxIncrementSequence(int[] data, int len) {
		int[] dp = new int[len];
		dp[0] = 1;
		int max = 1;
		List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		int index = -1, k = 0;
		ArrayList<Integer> tem = new ArrayList<Integer>();
		tem.add(data[0]);
		res.add(tem);
		for (int i = 1; i < len; i++) {
			index = -1;
			tem = new ArrayList<Integer>();
			for (int j = 0; j < i; j++) {
				if (data[i] > data[j] && dp[j] > dp[i]) {
					dp[i] = dp[j];
					index = j;
				}
			}
			++dp[i];
			if (index > -1) {
				tem.addAll(res.get(index));
			}
			tem.add(data[i]);
			res.add(tem);
			if (dp[i] > max) {
				max = dp[i];
				k = i;
			}
		}
		tem = res.get(k);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tem.size() - 1; i++) {
			sb.append(tem.get(i));
			sb.append(" ");
		}
		sb.append(tem.get(tem.size() - 1));
		System.out.println(sb.toString());
	}
}