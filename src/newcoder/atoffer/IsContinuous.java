package newcoder.atoffer;

import java.util.Arrays;

public class IsContinuous {
	public boolean isContinuous(int[] numbers) {
		if (numbers == null) {
			return false;
		}
		Arrays.sort(numbers);
		int zero = 0, i = 0;
		for (; i < numbers.length && numbers[i] == 0; i++) {
			zero++;
		}
		for (; i < numbers.length - 1 && zero >= 0; i++) {
			if (numbers[i] == numbers[i + 1]) {
				return false;
			}
			if (numbers[i] + 1 + zero < numbers[i + 1]) {
				return false;
			}
			zero -= numbers[i + 1] - numbers[i] - 1;
		}
		return i == numbers.length - 1;
	}
}
