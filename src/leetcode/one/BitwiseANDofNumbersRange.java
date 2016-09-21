package leetcode.one;

public class BitwiseANDofNumbersRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rangeBitwiseAnd(int m, int n) {
		int offset = 0;
		while (m != n) {
			m >>= 1;
			n >>= 1;
			offset++;
		}
		return m << offset;
	}
}
