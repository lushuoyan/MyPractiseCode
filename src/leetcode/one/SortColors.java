package leetcode.one;

public class SortColors {
	public void sortColors(int[] nums) {  
        int len = nums.length;  
        int i, r = 0, b = 0;  
        for (i = 0; i < len-b; i++) {  
            if (nums[i] == 0) {  
                swap(nums, i, r);  
                r++;  
            } else if (nums[i] == 2) {  
                swap(nums, i, len-1-b);  
                b++;  
                i--; //���潻��������Ԫ��ҲҪ�����ж�  
            }   
        }  
    }
	
	public void swap(int[] A, int a, int b) {  
        int tmp = A[a];  
        A[a] = A[b];  
        A[b] = tmp;  
    }
}
