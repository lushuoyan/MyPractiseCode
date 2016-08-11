package ccf.fourteenine.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(reader);
			String example = input.readLine();
			String typeS = input.readLine();
			String countS = input.readLine();
			int count = Integer.parseInt(countS);
			String[] line = new String[count];
			String[] lineOrg = new String[count];
			if (typeS.endsWith("0")) {
				for (int i = 0; i < count; i++) {
					lineOrg[i] = input.readLine();
					line[i] = lineOrg[i].toLowerCase();
				}
				example = example.toLowerCase();
			} else {
				for (int i = 0; i < count; i++) {
					line[i] = input.readLine();
					lineOrg[i] = line[i];
				}
			}
			String[] result = new String[count];
			for (int i = 0; i < count; i++) {
				if (line[i].indexOf(example) >= 0) {
					result[i] = lineOrg[i];
				} else {
					continue;
				}
			}
			int i = 0;
			while (i < count) {
				String s = result[i];
				if (s != null && !s.equals("")) {
					System.out.println(result[i]);
				}
				i++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
