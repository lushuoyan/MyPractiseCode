package ccf.ccf1403.one;

/*
 * ��������
 �� N �������Ҹ�����ͬ�������������һ����������������ж��ٶ��෴��(a �� -a Ϊһ���෴��)��
 �����ʽ
 ��һ�а���һ�������� N��(1 �� N �� 500)��
 �ڶ���Ϊ N ���õ����ո�����ķ�������,ÿ�����ľ���ֵ������1000,��֤��Щ����������ͬ��
 �����ʽ
 ֻ���һ������,���� N �����а������ٶ��෴����
 ��������
 5
 1 2 3 -1 -2
 �������
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
