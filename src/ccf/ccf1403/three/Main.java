package ccf.ccf1403.three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	static class Command {
		String command;
		String value;
	}

	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			String allCommand = reader.readLine();
			HashMap<String, Boolean> commandMap = new HashMap<String, Boolean>();
			for (int i = allCommand.length() - 1; i > -1; i--) {
				char temp = allCommand.charAt(i);
				if (temp == Character.valueOf(':')) {
					commandMap
							.put(String.valueOf(allCommand.charAt(--i)), true);
				} else {
					commandMap.put(String.valueOf(temp), false);
				}
			}
			int caseNum = Integer.parseInt(reader.readLine());
			String[] result = new String[caseNum];
			for (int i = 0; i < caseNum; i++) {
				String outPutLine = "Case " + (i + 1) + ": ";
				String newLinew = reader.readLine();
				if (newLinew.length() == 2) {
					result[i] = outPutLine;
					continue;
				}
				String[] commandArray = newLinew.substring(3).split(" ");
				Command[] commandValid = new Command[26];
				for (int j = 0; j < commandArray.length; j++) {
					String temp = commandArray[j];
					Command command = new Command();
					command.command = temp;
					if (temp.length() != 2) {
						break;
					}
					if (temp.indexOf("-") == 0) {
						temp = temp.substring(1);
					}
					if (!commandMap.containsKey(temp)) {
						break;
					}
					if (commandMap.get(temp)) {
						if (j + 1 >= commandArray.length) {
							break;
						}
						command.value = commandArray[++j];
					}
					if (temp.charAt(0) - 'a' > 25) {
						break;
					}
					commandValid[temp.charAt(0) - 'a'] = command;
				}

				for (int j = 0; j < 26; j++) {
					Command temp = commandValid[j];
					if (temp == null) {
						continue;
					}
					boolean value = commandMap.get(temp.command.substring(1))
							.booleanValue();
					String valueS = value ? " " + temp.value : "";
					outPutLine = outPutLine + temp.command + valueS + " ";
				}

				result[i] = outPutLine;
			}
			for (int i = 0; i < caseNum; i++) {
				System.out.println(result[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
