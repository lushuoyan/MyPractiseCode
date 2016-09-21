package company.°Ù¶È17.solution;

import java.util.HashSet;

public class Solution {
	public static int collectApples(int N, int K, int[] applesAtNodes,
			int[][] connectedNodes) {
		HashSet<Integer> apples = new HashSet<Integer>();
		for (int i = 0; i < K; i++) {
			apples.add(applesAtNodes[i]);
		}
		if (N == 0) {
			return 0;
		}
		int res = 0;
		boolean[] passed = new boolean[N];
		for (int ind = 0; ind < N; ind++) {
			passed[ind] = true;
			res = Math.max(
					res,
					dfs(connectedNodes[ind][1], N, passed,
							apples.contains(connectedNodes[ind][0]) ? 1 : 0,
							apples, connectedNodes));
			passed[ind] = false;
		}
		for (int ind = 0; ind < N; ind++) {
			passed[ind] = true;
			res = Math.max(
					res,
					dfs(connectedNodes[ind][0], N, passed,
							apples.contains(connectedNodes[ind][1]) ? 1 : 0,
							apples, connectedNodes));
			passed[ind] = false;
		}
		return res;
	}

	private static int dfs(int ind, int N, boolean[] passed, int res,
			HashSet<Integer> apples, int[][] connectedNodes) {
		if (ind <= 0 || ind >= N) {
			return res;
		}
		if (passed[ind]) {
			return res;
		}
		for (int i = 0; i < N; i++) {
			if (connectedNodes[i][0] != ind) {
				continue;
			}
			passed[i] = true;
			res = Math.max(res,
							dfs(connectedNodes[ind][1],
									N,
									passed,
									res	+ (apples.contains(connectedNodes[ind][0]) ? 1 : 0),
									apples,
									connectedNodes));
			passed[i] = false;
		}
		for (int i = 0; i < N; i++) {
			if (connectedNodes[i][1] != ind) {
				continue;
			}
			passed[i] = true;
			res = Math.max(res,
							dfs(connectedNodes[ind][0],
									N,
									passed,
									res	+ (apples.contains(connectedNodes[ind][1]) ? 1 : 0),
									apples,
									connectedNodes));
			passed[i] = false;
		}
		return res;
	}
}
