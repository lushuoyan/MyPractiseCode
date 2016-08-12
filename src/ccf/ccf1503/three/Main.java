package ccf.ccf1503.three;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			reader = new BufferedReader(input);
			String inPutString = reader.readLine();
			String[] inputArray = inPutString.split(" ");
			int month = Integer.parseInt(inputArray[0]);
			int week = Integer.parseInt(inputArray[1]);
			int dayOfWeek = Integer.parseInt(inputArray[2]);
			int first = Integer.parseInt(inputArray[3]);
			int second = Integer.parseInt(inputArray[4]);
			Calendar startYear = Calendar.getInstance();
			startYear.clear();
			Calendar endYear = Calendar.getInstance();
			endYear.clear();
			if (first > second) {
				int temp = first;
				first = second;
				second = temp;
			}
			SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			startYear.set(Calendar.YEAR, first);
			endYear.set(Calendar.YEAR, second);
			System.out.println("1:"+df.format(startYear.getTime()));
			startYear.set(Calendar.MONTH, month-1);
			endYear.set(Calendar.MONTH, month);
			System.out.println("2:"+df.format(startYear.getTime()));
			startYear.set(Calendar.WEEK_OF_MONTH, week);
			endYear.set(Calendar.WEEK_OF_MONTH, week);
			System.out.println("3:"+df.format(startYear.getTime()));
			System.out.println(startYear.get(Calendar.DAY_OF_WEEK));
			startYear.set(Calendar.DAY_OF_WEEK_IN_MONTH, dayOfWeek);
			endYear.set(Calendar.DAY_OF_WEEK_IN_MONTH, dayOfWeek);
			System.out.println("4:"+df.format(startYear.getTime()));
			System.out.println(df.format(endYear.getTime()));
			int firstYear = startYear.get(Calendar.YEAR);
			int firstMonth = startYear.get(Calendar.MONTH);
			int firstDay = startYear.get(Calendar.DAY_OF_MONTH);
			if (firstYear != first || firstMonth != week) {
				System.out.println("none");
			} else {
				System.out.println(firstYear + "/" + firstMonth + "/"
						+ firstDay);
			}
			int secondYear = endYear.get(Calendar.YEAR);
			int secondMonth = endYear.get(Calendar.MONTH);
			int secondDay = endYear.get(Calendar.DAY_OF_MONTH);
			if (secondYear != first || secondMonth != week) {
				System.out.println("none");
			} else {
				System.out.println(secondYear + "/" + secondMonth + "/"
						+ secondDay);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
