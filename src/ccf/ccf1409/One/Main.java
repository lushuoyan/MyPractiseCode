package ccf.ccf1409.One;

/*
 * ��������
 ����n����ͬ������������Щ�����ж��ٶ����������ǵ�ֵ�������1��
 �����ʽ
 ����ĵ�һ�а���һ������n����ʾ���������ĸ�����
 �ڶ��а�����������n��������
 �����ʽ
 ���һ����������ʾֵ�������1�����Եĸ�����
 ��������
 6
 10 2 6 3 7 8
 �������
 3
 ����˵��
 ֵ�������1�����԰���(2, 3), (6, 7), (7, 8)��
 ����������ģ��Լ��
 1<=n<=1000������������Ϊ������10000�ķǸ�������
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
