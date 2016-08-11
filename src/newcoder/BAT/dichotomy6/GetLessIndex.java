package newcoder.BAT.dichotomy6;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��7��4��
 */
/*
 * ����ֲ���С�ĸ��arr����Ϊ1ʱ��arr[0]�Ǿֲ���С��arr�ĳ���ΪN(N>1)ʱ�����arr[0]<arr[1]����ôarr[0]�Ǿֲ���С�����arr
 * [
 * N-1]<arr[N-2]����ôarr[N-1]�Ǿֲ���С�����0<i<N-1������arr[i]<arr[i-1]����arr[i]<arr[i+1]����ôarr
 * [i]�Ǿֲ���С�� ������������arr����֪arr�������������ڵ���������ȣ�дһ��������ֻ�践��arr������һ���ֲ���С���ֵ�λ�ü��ɡ�
 */
public class GetLessIndex{
	public int getLessIndex(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		if (arr.length == 1 || arr[0] < arr[1]) {
			return 0;
		}
		int n = arr.length;
		if (arr[n - 1] < arr[n - 2]) {
			return n - 1;
		}
		int left = 1;
		int right = n - 2;
		while (left != right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				return mid;
			} else if (arr[mid] >= arr[mid - 1]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
