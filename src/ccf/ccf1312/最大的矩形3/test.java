package ccf.ccf1312.���ľ���3;

import java.util.*;

public class test {
	public static void main(String[] args) {
		new test().run();
	}

	public void run() {
		Scanner fin = new Scanner(System.in);
		int N = fin.nextInt();
		int[] height = new int[N];
		for (int i = 0; i < N; ++i)
			height[i] = fin.nextInt();
		int result = 0;
		for (int i = 0; i < N; ++i) {
			int width = 1;// ÿ��ѭ��i����ʱ����Ҫ��width��Ϊ1 //���i�����ε���Ѱ��
			for (int j = i - 1; j >= 0; --j) {
				if (height[j] < height[i])
					break;
				++width;
			} // ���i�����ε��ұ�Ѱ��
			for (int j = i + 1; j < N; ++j) {
				if (height[j] < height[i])
					break;
				++width;
			}
			int area = width * height[i];// ������ǰ��i�����ο��������
			result = Math.max(result, area);// max(a1,a2)ȡ�����������ֵ }
			System.out.println(result);
		}
	}
}