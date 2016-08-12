package ccf.ccf1503.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			int count = Integer.parseInt(reader.readLine());
			String[] allNumber = reader.readLine().split(" ");
			HashMap<Integer, Integer> inpuResult = new HashMap<Integer, Integer>();
			int max = 0;
			for (int i = 0; i < count; i++) {
				int temp = Integer.parseInt(allNumber[i]);
				if (inpuResult.containsKey(temp)) {
					int tempInt = inpuResult.get(temp) + 1;
					if (tempInt > max) {
						max = tempInt;
					}
					inpuResult.put(temp, tempInt);
				} else {
					inpuResult.put(temp, 1);
				}
			}
			int[][] result = new int[inpuResult.size()][2];
			Iterator<Entry<Integer, Integer>> iterator = inpuResult.entrySet()
					.iterator();
			int i = 0;
			while (iterator.hasNext()) {
				Entry<Integer, Integer> temp = iterator.next();
				result[i][0] = temp.getKey();
				result[i++][1] = temp.getValue();
			}
			for (i = 0; i < inpuResult.size() - 1; i++) {
				for (int j = 0; j < inpuResult.size() - 1 - i; j++) {
					if (result[j][1] < result[j + 1][1]) {
						int temp0 = result[j][0];
						int temp1 = result[j][1];
						result[j][0] = result[j + 1][0];
						result[j][1] = result[j + 1][1];
						result[j + 1][0] = temp0;
						result[j + 1][1] = temp1;
					} else if ((result[j][1] == result[j + 1][1])
							&& (result[j][0] > result[j + 1][0])) {
						int temp0 = result[j][0];
						int temp1 = result[j][1];
						result[j][0] = result[j + 1][0];
						result[j][1] = result[j + 1][1];
						result[j + 1][0] = temp0;
						result[j + 1][1] = temp1;
					}
				}
			}
			for (i = 0; i < inpuResult.size(); i++) {
				System.out.println(result[i][0] + " " + result[i][1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
