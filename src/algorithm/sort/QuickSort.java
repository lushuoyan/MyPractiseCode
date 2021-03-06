package algorithm.sort;

public class QuickSort {
	static int a[] = { 28,84,18,36,60,72,48 };

	public QuickSort() {
		quick(a);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static int getMiddle(int[] list, int low, int high) {
		int tmp = list[low]; // 数组的第一个作为中轴
		while (low < high) {
			while (low < high && list[high] >= tmp) {
				high--;
			}
			list[low] = list[high]; // 比中轴小的记录移到低端
			while (low < high && list[low] <= tmp) {
				low++;
			}
			list[high] = list[low]; // 比中轴大的记录移到高端
		}
		list[low] = tmp; // 中轴记录到尾
		return low; // 返回中轴的位置
	}

	public static void _quickSort(int[] list, int low, int high) {
		if (low < high) {
			int middle = getMiddle(list, low, high); // 将list数组进行一分为二
			_quickSort(list, low, middle - 1); // 对低字表进行递归排序
			_quickSort(list, middle + 1, high); // 对高字表进行递归排序
			for (int i = 0; i < list.length; i++)
				System.out.print(list[i]+" ");
			System.out.println();
		}
	}

	public static void quick(int[] a2) {
		if (a2.length > 0) { // 查看数组是否为空
			_quickSort(a2, 0, a2.length - 1);
		}
	}
	
	public static void main(String[] args) {
		quick(a);
	}
}
