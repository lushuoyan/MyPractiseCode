package ccf.ccf1403.one;

/*
 * 问题描述
 有 N 个非零且各不相同的整数。请你编一个程序求出它们中有多少对相反数(a 和 -a 为一对相反数)。
 输入格式
 第一行包含一个正整数 N。(1 ≤ N ≤ 500)。
 第二行为 N 个用单个空格隔开的非零整数,每个数的绝对值不超过1000,保证这些整数各不相同。
 输出格式
 只输出一个整数,即这 N 个数中包含多少对相反数。
 样例输入
 5
 1 2 3 -1 -2
 样例输出
 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			int N = Integer.parseInt(reader.readLine());
			HashSet<Integer> h = new HashSet<Integer>();
			String allNumberS = reader.readLine();
			int result = 0;
			for (int i = 0; i < N; i++) {
				int temp;
				int position = allNumberS.indexOf(" ");
				if (position == -1) {
					temp = Integer.parseInt(allNumberS);
				} else {
					temp = Integer.parseInt(allNumberS.substring(0, position));
				}
				if (h.contains(temp * (-1))) {
					result++;
				} else {
					h.add(temp);
				}
				allNumberS = allNumberS.substring(position + 1);
			}
			System.out.println(result);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
