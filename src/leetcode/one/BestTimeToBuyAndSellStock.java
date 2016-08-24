package leetcode.one;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��22��
 */
public class BestTimeToBuyAndSellStock{
	public int maxProfit(int[] prices) {
		if (prices.length < 2){
			return 0;
		}

		int maxProfit = 0;
		int curMin = prices[0];

		for (int i = 1; i < prices.length; i++) {
			curMin = Math.min(curMin, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - curMin);
		}

		return maxProfit;
	}
}
