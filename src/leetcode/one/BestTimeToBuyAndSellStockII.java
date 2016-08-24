package leetcode.one;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��22��
 */
public class BestTimeToBuyAndSellStockII{
	public int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;

		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			int diff = prices[i] - prices[i - 1];
			if (diff > 0) {
				maxProfit += diff;
			}
		}

		return maxProfit;
	}
}
