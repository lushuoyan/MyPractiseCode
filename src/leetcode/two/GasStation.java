package leetcode.two;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年7月1日
 */
public class GasStation{
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int res = -1;
		if (gas.length == 0) {
			return -1;
		}
		int tank = 0;
		int[] dif = new int[gas.length * 2];
		for (int i = 0; i < gas.length; i++) {
			dif[i] = gas[i] - cost[i];
		}
		for (int i = gas.length; i < dif.length; i++) {
			dif[i] = gas[i - gas.length] - cost[i - gas.length];
		}
		int end = gas.length;
		for (int i = 0; i < end; i++) {
			if (dif[i] < 0 && res == -1) {
				continue;
			}
			if (tank == 0 && res == -1) {
				res = i;
				end = end + i;
			}
			tank = tank + dif[i];
			if (tank < 0) {
				if (i > gas.length) {
					i = res + 1;
					if (i == gas.length) {
						res = -1;
						break;
					}
				}
				res = -1;
				tank = 0;
				end = gas.length;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] gas = { 99, 98, 97, 100 };
		int[] cost = { 100, 100, 100, 97 };
		System.out.println(canCompleteCircuit(gas, cost));
	}
}
