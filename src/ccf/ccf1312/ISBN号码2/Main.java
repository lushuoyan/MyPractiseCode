package ccf.ccf1312.ISBN号码2;

//201312-2
// ISBN号码
/*
 * 　　每一本正式出版的图书都有一个ISBN号码与之对应，ISBN码包括9位数字、1位识别码和3位分隔符，其规定格式如“x-xxx-xxxxx-x”，其中符号
 * “-”是分隔符（键盘上的减号），最后一位是识别码，例如0-670-82162-4就是一个标准的ISBN码。ISBN码的首位数字表示书籍的出版语言，
 * 例如0代表英语
 * ；第一个分隔符“-”之后的三位数字代表出版社，例如670代表维京出版社；第二个分隔之后的五位数字代表该书在出版社的编号；最后一位为识别码。
 * 　　识别码的计算方法如下： 　　首位数字乘以1加上次位数字乘以2……以此类推，用所得的结果mod
 * 11，所得的余数即为识别码，如果余数为10，则识别码为大写字母X
 * 。例如ISBN号码0-670-82162-4中的识别码4是这样得到的：对067082162这9个数字
 * ，从左至右，分别乘以1，2，…，9，再求和，即0×1+6×2+……+2×9=158，然后取158 mod 11的结果4作为识别码。
 * 　　编写程序判断输入的ISBN号码中识别码是否正确，如果正确，则仅输出“Right”；如果错误，则输出是正确的ISBN号码。
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			String inputString = reader.readLine();
			String outputString = inputString.substring(0,
					inputString.length() - 1);
			String identifyNumberString = inputString.substring(inputString
					.lastIndexOf("-") + 1);
			int identifyNumber;
			if (identifyNumberString.equals("X")) {
				identifyNumber = 10;
			} else {
				identifyNumber = Integer.parseInt(identifyNumberString);
			}
			String pureNumber = inputString.replace("-", "");
			int result = 0;
			for (int i = 1; i < 10; i++) {
				result = result + Integer.parseInt(pureNumber.substring(0, 1))
						* i;
				pureNumber = pureNumber.substring(1);
			}
			if (identifyNumber == (result % 11)) {
				System.out.println("Right");
			} else {
				if (result % 11 == 10) {
					System.out.println(outputString + "X");
				} else {
					System.out.println(outputString + "" + result % 11);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
