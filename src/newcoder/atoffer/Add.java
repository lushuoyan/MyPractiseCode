package newcoder.atoffer;

import java.math.BigInteger;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月30日
 */
public class Add{
	public int Add(int num1, int num2) {
		BigInteger bi1 = new BigInteger(String.valueOf(num1));
		BigInteger bi2 = new BigInteger(String.valueOf(num2));
		return bi1.add(bi2).intValue();
	}
}
