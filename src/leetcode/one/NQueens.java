package leetcode.one;
import java.util.ArrayList;
import java.util.List;

public class NQueens {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<List<String>>();

		int[] queenList = new int[n];
		placeQueen(queenList, 0, n, result);
		return result;
	}

	public static void placeQueen(int[] queenList, int row, int n,
			List<List<String>> ret) {
		// Base Case, 已经完成任务了
		if (row == n) {
			StringBuilder[] sol = new StringBuilder[n];

			// 对数组内每一个对象都要new出其对象
			for (int i = 0; i < n; i++) {
				sol[i] = new StringBuilder();
				for (int j = 0; j < n; j++) {
					sol[i].append(".");
				}
			}
			// 在相应的地方放置queen
			for (int i = 0; i < n; i++) {
				sol[i].setCharAt(queenList[i], 'Q');
			}
			ArrayList<String> ss = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				ss.add(sol[i].toString());
			}
			ret.add(ss);
			return;
		}

		// 开始这一行的查找
		// 遍历第row行的所有列，测试哪一个位置是安全的
		for (int col = 0; col < n; col++) {
			if (isSafe(queenList, row, col)) {
				queenList[row] = col;
				placeQueen(queenList, row + 1, n, ret);
			}
		}
	}

	public static boolean isSafe(int[] queenList, int row, int col) {
		for (int preRow = 0; preRow < row; preRow++) {
			int preCol = queenList[preRow];
			if (preRow == row) { // 理论上不必检查，因为preRow是总是小于row的
				return false;
			}
			if (preCol == col) { // 检查是否在同一列
				return false;
			}
			if (row - preRow == col - preCol) { // 反对角线
				return false;
			}
			if (preRow + preCol == row + col) { // 正对角线
				return false;
			}
		}
		return true;
	}
	
}
