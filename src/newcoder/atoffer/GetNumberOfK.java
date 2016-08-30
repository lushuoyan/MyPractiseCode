package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月29日
 */
public class GetNumberOfK{
	public int GetNumberOfK(int[] array, int k) {
		if (array == null || array.length == 0 || k < array[0]
				|| k > array[array.length - 1])
			return 0;
		return get(array, k, 0, array.length - 1);

	}

	int get(int[] array, int k, int begin, int end) {
		if (begin > end)
			return 0;
		int mid = (end - begin) / 2 + begin;
		if (k > array[mid])
			return get(array, k, mid + 1, end);
		else if (k < array[mid])
			return get(array, k, begin, mid - 1);
		else {
			return 1 + get(array, k, begin, mid - 1)
					+ get(array, k, mid + 1, end);
		}

	}
}
