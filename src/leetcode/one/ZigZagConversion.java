package leetcode.one;

public class ZigZagConversion {

	public static void main(String[] args) {
		convert("PAYPALISHIRING",3);
	}

	public static String convert(String s, int numRows) {
		if(s.length()<2){
			return s;
		}
		int row = s.length() / 4 + 1;
		String[][] array = new String[numRows][row*2];
		int length = s.length();
		int j = 0;
		int k = 0;
		for (int i = 0; i < length; i++) {
			if("".equals(s)){
				break;
			}
			if (k % (numRows - 1) == 0) {
				array[j++][k] = s.substring(0, 1);
				if (j == numRows ) {
					j = numRows - 2;
					k++;
				}
			} else {
				array[j--][k++] = s.substring(0, 1);
			}
			s = s.substring(1);
		}
		String result = "";
		j = 0;
		k = 0;
		for(int i = 0; i < numRows*row*2; i++){
			if(array[j][k]!=null){
				result+=array[j][k];
			}
			if(k==row*2-1){
				k=0;
				j++;
			}else{
				k++;
			}
		}
		return result;
	}
}
