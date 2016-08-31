package company.ÖÐÐË17;

public class weiyi {
	public static String test(String input) {
		String[] arr = input.split(" ");
		StringBuilder str = new StringBuilder();
		StringBuilder res = new StringBuilder();
		for (String cur : arr) {
			str.setLength(0);
			char[] temp = cur.toCharArray();
			for (int i = 0, j = temp.length - 1; i < temp.length; i++, j--) {
				str.append(chage(temp[i], j));
			}
			res.append(str+" ");
		}
		return res.toString();
	}

	private static String chage(char source, int length) {
		int temp = (source - 'a' + length) % 26;
		Character target = new Character((char) ('a' + temp));
		return target.toString();
	}

	public static void main(String[] args) {
		System.out.println(test("yum feed"));
	}
}
