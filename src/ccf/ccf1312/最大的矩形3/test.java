package ccf.ccf1312.最大的矩形3;

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
			int width = 1;// 每次循环i自增时，都要将width设为1 //向第i个矩形的左方寻找
			for (int j = i - 1; j >= 0; --j) {
				if (height[j] < height[i])
					break;
				++width;
			} // 向第i个矩形的右边寻找
			for (int j = i + 1; j < N; ++j) {
				if (height[j] < height[i])
					break;
				++width;
			}
			int area = width * height[i];// 包含当前第i个矩形框的最大面积
			result = Math.max(result, area);// max(a1,a2)取两个数的最大值 }
			System.out.println(result);
		}
	}
}