package ccf.ccf1312.最大的矩形4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class TwelveFour {
	//201312-4
	//有趣的数
	/*
	 * 问题描述 　　我们把一个数称为有趣的，当且仅当： 　　1. 它的数字只包含0, 1, 2, 3，且这四个数字都出现过至少一次。 　　2.
	 * 所有的0都出现在所有的1之前，而所有的2都出现在所有的3之前。 　　3. 最高位数字不为0。
	 * 　　因此，符合我们定义的最小的有趣的数是2013。除此以外，4位的有趣的数还有两个：2031和2301。
	 * 　　请计算恰好有n位的有趣的数的个数。由于答案可能非常大，只需要输出答案除以1000000007的余数。 输入格式
	 * 　　输入只有一行，包括恰好一个正整数n (4 ≤ n ≤ 1000)。 输出格式 　　输出只有一行，包括恰好n
	 * 位的整数中有趣的数的个数除以1000000007的余数。 样例输入 4 样例输出 3
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        String bitS = input.readLine();
        int bit = Integer.parseInt(bitS);
        
	}
}