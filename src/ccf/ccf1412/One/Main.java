package ccf.ccf1412.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			int N = Integer.parseInt(reader.readLine());
			int[] result = new int[N];
			String inputString = reader.readLine();
			HashMap<Integer,Integer> inputN = new HashMap<Integer,Integer>();
			for(int i = 0;i < N; i++){
				int position = inputString.indexOf(" ");
				int temp;
				if(position==-1){
					temp = Integer.parseInt(inputString);
				}else{
					temp = Integer.parseInt(inputString.substring(0,position));
				}
				if(inputN.containsKey(temp)){
					int enterTimes = inputN.get(temp);
					inputN.put(temp, enterTimes+1);
					result[i] = enterTimes+1;
				}else{
					inputN.put(temp, 1);
					result[i] = 1;
				}
				inputString = inputString.substring(position+1);
			}
			String outPutString = result[0]+"";
			for(int i = 1;i < N; i++){
				outPutString = outPutString + " " + result[i];
			}
			System.out.println(outPutString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
