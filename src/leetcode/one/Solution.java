package leetcode.one;

import java.util.Stack;


public class Solution {
    public static void main(String[] args) {
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	while(true){
    		
    	}
	}
    
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums.length==0){
        	return new int[0];
        }
        int[] result = new int[nums.length-k+1];
        for(int i = 0 ; i < result.length;i++){
            int max=nums[i];
            for(int j = 1 ; j < k ;j++){
                if(max<nums[i+j]){
                    max = nums[i+j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}