package newcoder.atoffer;

/*归并排序的改进，把数据分成前后两个数组(递归分到每个数组仅有一个数据项)，
 合并数组，合并时，出现前面的数组值array[i]大于后面数组值array[j]时；则前面
 数组array[i]~array[mid]都是大于array[j]的，count += mid+1 - i
 参考剑指Offer，但是感觉剑指Offer归并过程少了一步拷贝过程。
 还有就是测试用例输出结果比较大，对每次返回的count mod(1000000007)求余
 */
public class InversePairs {
	public int InversePairs(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int[] copy = new int[array.length];
		return inversePairsCore(array, copy, 0, array.length - 1);
	}

	private int inversePairsCore(int[] array, int[] copy, int low, int high) {
		if (low == high) {
			return 0;
		}
		int mid = low + (high - low) / 2;
		int leftCount = inversePairsCore(array, copy, low, mid) % 1000000007;
		int rightCount = inversePairsCore(array, copy, mid + 1, high) % 1000000007;
		int count = 0;
		int m = mid;
		int h = high;
		int locCopy = high;
		while (m >= low && h > mid) {
			if (array[m] <= array[h]) {
				copy[locCopy--] = array[h--];
				continue;
			}
			count += h - mid;
			copy[locCopy--] = array[m--];
			if (count >= 1000000007) {
				count %= 1000000007;
			}
		}
		while (m >= low) {
			copy[locCopy--] = array[m--];
		}
		while (h > mid) {
			copy[locCopy--] = array[h--];
		}
		for (int s = low; s <= high; s++) {
			array[s] = copy[s];
		}
		return (leftCount + rightCount + count) % 1000000007;
	}

	public static void main(String[] args) {
		InversePairs test = new InversePairs();
		System.out.println(test.InversePairs(new int[] { 364, 637, 341, 406,
				747, 995, 234, 971, 571, 219, 993, 407, 416, 366, 315, 301,
				601, 650, 418, 355, 460, 505, 360, 965, 516, 648, 727, 667,
				465, 849, 455, 181, 486, 149, 588, 233, 144, 174, 557, 67, 746,
				550, 474, 162, 268, 142, 463, 221, 882, 576, 604, 739, 288,
				569, 256, 936, 275, 401, 497, 82, 935, 983, 583, 523, 697, 478,
				147, 795, 380, 973, 958, 115, 773, 870, 259, 655, 446, 863,
				735, 784, 3, 671, 433, 630, 425, 930, 64, 266, 235, 187, 284,
				665, 874, 80, 45, 848, 38, 811, 267, 575 }));
	}
}
