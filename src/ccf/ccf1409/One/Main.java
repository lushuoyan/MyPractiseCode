package ccf.ccf1409.One;

/*
 * 问题描述
 给定n个不同的整数，问这些数中有多少对整数，它们的值正好相差1。
 输入格式
 输入的第一行包含一个整数n，表示给定整数的个数。
 第二行包含所给定的n个整数。
 输出格式
 输出一个整数，表示值正好相差1的数对的个数。
 样例输入
 6
 10 2 6 3 7 8
 样例输出
 3
 样例说明
 值正好相差1的数对包括(2, 3), (6, 7), (7, 8)。
 评测用例规模与约定
 1<=n<=1000，给定的整数为不超过10000的非负整数。
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			int number = Integer.parseInt(reader.readLine());
			HashSet<Integer> allNumber = new HashSet<Integer>();
			String allNumberS = reader.readLine();
			int result = 0;
			for (int i = 0; i < number; i++) {
				int position = allNumberS.indexOf(" ");
				int temp;
				if (position == -1) {
					temp = Integer.parseInt(allNumberS);
				} else {
					temp = Integer.parseInt(allNumberS.substring(0, position));
				}

				if (allNumber.contains(temp + 1)) {
					result++;
				} 
				if (allNumber.contains(temp - 1)) {
					result++;
				}
				allNumber.add(temp);
				allNumberS = allNumberS.substring(position + 1);
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
