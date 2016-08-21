package leetcode.zero;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		int[] prices = { 1, 0, 4 ,0};
		if (prices.length == 0 || prices.length == 1) {
			// return 0;
		}
		int result = 0;

		for (int i = 0; i < prices.length; i++) {
			if (i != prices.length - 1 && prices[i] >= prices[i + 1]) {
				continue;
			}
			for (int j = i + 1; j < prices.length; j++) {
				if(prices[j] - prices[i]>result){
					result = prices[j] - prices[i];
				}
			}
		}
		// return highest - least;
		System.out.println(result);
	}

}
