package newcoder.wanmeishijie.one;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int len = 1;
		int[] tempArr = new int[input.length];
		tempArr[0] = Integer.parseInt(input[0]);
		for (int i = 1; i < input.length; i++) {
			int temp = Integer.parseInt(input[i]);
			if (temp > tempArr[len - 1]) {
				tempArr[len++] = temp;
			} else {
				int left = 0;
				int right = len - 1;
				while (left <= right) {
					int mid = (right + left) / 2;
					if (tempArr[mid] <= temp) {
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				}
				tempArr[left] = temp;
			}
		}
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == 0) {
				break;
			}
			System.out.print(tempArr[i] + " ");
		}
	}

	public static int GetLongestIncrementalSubSequence__O_NLogN_(int array[]) {
		// use the result array to get the longest length
		int resultArray[] = new int[array.length];
		if (array.length == 0)
			return 0;
		resultArray[0] = array[0];
		int curLongestLength = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > resultArray[curLongestLength - 1]) {
				resultArray[++curLongestLength - 1] = array[i];
			} else {
				if (array[i] <= resultArray[0]) {
					resultArray[0] = array[i];
					continue;
				}
				// use binary search to fill the correct position
				int start = 0; // point to b[0]
				int end = curLongestLength - 1; // point to b[curLongestLength -
												// 1]
				for (; start != end - 1;) {
					if (array[i] > resultArray[(start + end) / 2])
						start = (start + end) / 2;
					else
						end = (start + end) / 2;
				}
				resultArray[end] = array[i];
			}
		}
		return curLongestLength;
	}
}
