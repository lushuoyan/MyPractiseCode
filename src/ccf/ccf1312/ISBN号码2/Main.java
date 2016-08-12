package ccf.ccf1312.ISBN����2;

//201312-2
// ISBN����
/*
 * ����ÿһ����ʽ�����ͼ�鶼��һ��ISBN������֮��Ӧ��ISBN�����9λ���֡�1λʶ�����3λ�ָ�������涨��ʽ�硰x-xxx-xxxxx-x�������з���
 * ��-���Ƿָ����������ϵļ��ţ������һλ��ʶ���룬����0-670-82162-4����һ����׼��ISBN�롣ISBN�����λ���ֱ�ʾ�鼮�ĳ������ԣ�
 * ����0����Ӣ��
 * ����һ���ָ�����-��֮�����λ���ִ�������磬����670����ά�������磻�ڶ����ָ�֮�����λ���ִ�������ڳ�����ı�ţ����һλΪʶ���롣
 * ����ʶ����ļ��㷽�����£� ������λ���ֳ���1���ϴ�λ���ֳ���2�����Դ����ƣ������õĽ��mod
 * 11�����õ�������Ϊʶ���룬�������Ϊ10����ʶ����Ϊ��д��ĸX
 * ������ISBN����0-670-82162-4�е�ʶ����4�������õ��ģ���067082162��9������
 * ���������ң��ֱ����1��2������9������ͣ���0��1+6��2+����+2��9=158��Ȼ��ȡ158 mod 11�Ľ��4��Ϊʶ���롣
 * ������д�����ж������ISBN������ʶ�����Ƿ���ȷ�������ȷ����������Right��������������������ȷ��ISBN���롣
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
