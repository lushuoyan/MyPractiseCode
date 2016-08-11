package newcoder.BAT.sort2;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��15��
 */
public class Finder{
	public boolean findX(int[][] mat, int n, int m, int x) {
		int r = 0, c = m - 1;
		while (r < n && c >= 0) {
			if (mat[r][c] == x) {
				return true;
			}
			// ����ȵ�ǰ������˵�����е�����������x�����ơ���������
			if (mat[r][c] > x) {
				c--;
			} else {
				r++;
			}
		}
		return false;
	}
}
