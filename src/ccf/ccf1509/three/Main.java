package ccf.ccf1509.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArray = sc.nextLine().split(" ");
		int templateLineCount = Integer.parseInt(inputArray[0]);
		int variableCount = Integer.parseInt(inputArray[1]);
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < templateLineCount - 1; i++) {
			strBuilder.append(sc.nextLine() + "\n");
		}
		strBuilder.append(sc.nextLine());
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < variableCount; i++) {
			String input = sc.nextLine();
			int index = input.indexOf(" ");
			map.put(input.substring(0, index),
					input.substring(index + 2, input.length() - 1));
		}
		Set<String> set = map.keySet();
		String result = strBuilder.toString();
		for (String key : set) {
			String regex = "\\{{2}\\s" + key + "\\s\\}{2}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(result);
			result = matcher.replaceAll(map.get(key));
		}
		String regex_all = "\\{{2}\\s[a-zA-z_]{1}[0-9a-zA-Z_]{0,15}\\s\\}{2}";
		Pattern pattern = Pattern.compile(regex_all);
		Matcher matcher = pattern.matcher(result);
		result = matcher.replaceAll("");
		System.out.println(result);
	}
}
