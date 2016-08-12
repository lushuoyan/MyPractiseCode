package ccf.ccf1312.出现次数最多的数1;

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
			reader.readLine();
			String inputS = reader.readLine();
			String[] intputArray = inputS.split(" ");
			HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
			for (int i = 0; i < intputArray.length; i++) {
				int temp = Integer.parseInt(intputArray[i]);
				if (result.containsKey(temp)) {
					result.put(temp, result.get(temp) + 1);
				} else {
					result.put(temp, 1);
				}
			}
			Iterator<Entry<Integer, Integer>> itor = result.entrySet()
					.iterator();
			int resultConut = 0;
			int resultNum = Integer.MAX_VALUE;
			while (itor.hasNext()) {
				Entry<Integer, Integer> entry = itor.next();
				int tempNumber = (Integer) entry.getKey();
				int tempCount = (Integer) entry.getValue();
				if (tempCount > resultConut) {
					resultConut = tempCount;
					resultNum = tempNumber;
				} else if (tempCount == resultConut && resultNum > tempNumber) {
					resultNum = tempNumber;
				}
			}
			System.out.println(resultNum);

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}
