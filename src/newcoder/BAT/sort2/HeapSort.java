package newcoder.BAT.sort2;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��12��
 */
public class HeapSort{
	public int[] heapSort(int[] A, int n) {
		// 1,���������
		A = buildMaxHap(A);
		// 2,��������
		for (int i = n - 1; i > 0; i--) {
			// �Ѷ��Ͷѵ�Ԫ�ؽ���
			int tem = A[0];
			A[0] = A[i];
			A[i] = tem;
			adjustHeap(A, 0, i);// ��ʣ���Ԫ������ɶ�
		}
		return A;
	}

	private static int[] buildMaxHap(int[] A) {
		for (int i = A.length / 2; i >= 0; i--) {
			adjustHeap(A, i, A.length);
		}
		return A;
	}

	// �ѵĵ���:��Ԫ��A[k]���������𲽵������νṹ,����A[k]�������ӽڵ�
	private static void adjustHeap(int[] A, int k, int len) {
		int tem = A[k];
		for (int i = 2 * k + 1; i < len; i = 2 * i + 1) {
			// ��>��,ȡ��
			if (i != len - 1 && A[i] < A[i + 1]) {
				i++;
			}
			// ��>�ӽڵ�ϴ�ֵ,����
			if (tem > A[i]) {
				break;
			} else {
				// ����,�ı��ֲ,���������µ���
				A[k] = A[i];
				// ���ؼ����޸�kֵ���Ա�������µ���
				k = i;
			}
		}
		A[k] = tem; // �������Ľ���ֵ��������λ��
	}
}
