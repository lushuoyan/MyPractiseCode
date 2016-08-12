package ccf.ccf1312.最大的矩形3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			reader.readLine();
			String inputS = reader.readLine();
			String[] intputArray = inputS.split(" ");
			Stack<Element> stack = new Stack<Element>();
			int result = 0;
			for (int i = 0; i < intputArray.length; i++) {
				Element temp = new Element(Integer.parseInt(intputArray[i]), i);
				if (stack.isEmpty()) {
					stack.push(temp);
					continue;
				}
				Element top = null;
				while (stack.peek().height > temp.height) {
					top =  stack.pop();
					int tmpHeight = temp.height
							* (temp.index - top.index + 1);
					if (tmpHeight > result) {
						result = tmpHeight;
					}
					if (stack.isEmpty()) {
						break;
					}
				}
				if(top!=null){
					temp.index = top.index;
				}
				stack.push(temp);
			}
			Element lastEme = stack.pop();
			if(lastEme.height>result){
				
			}
			while (!stack.isEmpty()) {
				Element temp = stack.pop();
				if (temp.height > result) {
					result = temp.height;
				}
			}
			System.out.println(result);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}

class Element {
	public int height;
	public int index;

	public Element(int height, int index) {
		this.height = height;
		this.index = index;
	}
}
