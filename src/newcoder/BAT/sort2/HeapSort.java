package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月12日
 */
public class HeapSort{
	public int[] heapSort(int[] A, int n) {
		// 1,建立大根堆
		A = buildMaxHap(A);
		// 2,调整排序
		for (int i = n - 1; i > 0; i--) {
			// 堆顶和堆底元素交换
			int tem = A[0];
			A[0] = A[i];
			A[i] = tem;
			adjustHeap(A, 0, i);// 将剩余的元素整理成堆
		}
		return A;
	}

	private static int[] buildMaxHap(int[] A) {
		for (int i = A.length / 2; i >= 0; i--) {
			adjustHeap(A, i, A.length);
		}
		return A;
	}

	// 堆的调整:将元素A[k]自下往上逐步调整树形结构,调整A[k]的两个子节点
	private static void adjustHeap(int[] A, int k, int len) {
		int tem = A[k];
		for (int i = 2 * k + 1; i < len; i = 2 * i + 1) {
			// 右>左,取右
			if (i != len - 1 && A[i] < A[i + 1]) {
				i++;
			}
			// 根>子节点较大值,结束
			if (tem > A[i]) {
				break;
			} else {
				// 否则,改变根植,并继续向下调整
				A[k] = A[i];
				// 【关键】修改k值，以便继续向下调整
				k = i;
			}
		}
		A[k] = tem; // 被调整的结点的值放入最终位置
	}
}
