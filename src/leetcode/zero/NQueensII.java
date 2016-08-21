package leetcode.zero;


public class NQueensII {
	 public int totalNQueens(int n) {
		int[] result = new int[1];
		int[] queenList = new int[n];
		placeQueen(queenList, 0, n,result);
		return result[0];
	}
	 
	public static void placeQueen(int[] queenList, int row, int n,int[] result) {
		// Base Case, �Ѿ����������
		if (row == n) {
			result[0]++;
			return;
		}

		// ��ʼ��һ�еĲ���
		// ������row�е������У�������һ��λ���ǰ�ȫ��
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
			if (preRow == row) { // �����ϲ��ؼ�飬��ΪpreRow������С��row��
				return false;
			}
			if (preCol == col) { // ����Ƿ���ͬһ��
				return false;
			}
			if (row - preRow == col - preCol) { // ���Խ���
				return false;
			}
			if (preRow + preCol == row + col) { // ���Խ���
				return false;
			}
		}
		return true;
	}
	
	
	
}
