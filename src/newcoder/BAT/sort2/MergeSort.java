package newcoder.BAT.sort2;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��6��
 */
public class MergeSort{
	public int[] mergeSort(int[] A, int n) {
		sort(A, 0, n - 1);
		return A;
	}

	public void sort(int[] data, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			// ��������
			sort(data, left, middle);
			sort(data, middle + 1, right);
			// �ϲ�����
			merge(data, left, middle, right);
		}
	}

	// �ϲ���������������
	public void merge(int[] data, int left, int middle, int right) {
		// ��ʱ����
		int[] tempArr = new int[right - left + 1];
		// ��������α�
		int leftIndex = left;
		// �ұ������α�
		int rightIndex = middle + 1;
		// ��ʱ�����α�
		int tempIndex = 0;

		while (leftIndex <= middle && rightIndex <= right) {
			// ��ʱ����ѡȡ������������С��ֵ
			if (data[leftIndex] < data[rightIndex]) {
				tempArr[tempIndex++] = data[leftIndex++];
			} else {
				tempArr[tempIndex++] = data[rightIndex++];
			}
		}
		// ʣ���ֱ�ӷ���
		while (leftIndex <= middle) {
			tempArr[tempIndex++] = data[leftIndex++];
		}
		// ʣ���ֱ�ӷ���
		while (rightIndex <= right) {
			tempArr[tempIndex++] = data[rightIndex++];
		}
		// ����ʱ����Ż�ԭ������Ӧλ��
		int temp = 0;
		while ((temp + left) <= right) {
			data[left + temp] = tempArr[temp];
			temp++;
		}
	}
}
