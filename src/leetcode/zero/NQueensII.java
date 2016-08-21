package leetcode.zero;


public class NQueensII {
	 public int totalNQueens(int n) {
		int[] result = new int[1];
		int[] queenList = new int[n];
		placeQueen(queenList, 0, n,result);
		return result[0];
	}
	 
	public static void placeQueen(int[] queenList, int row, int n,int[] result) {
		// Base Case, 已经完成任务了
		if (row == n) {
			result[0]++;
			return;
		}

		// 开始这一行的查找
		// 遍历第row行的所有列，测试哪一个位置是安全的
		for (int col = 0; col < n; col++) {
			if (isSafe(queenList, row, col)) {
				queenList[row] = col;
				placeQueen(queenList, row + 1, n, result);
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
