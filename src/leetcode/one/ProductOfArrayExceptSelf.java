package leetcode.one;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] input = { 1, 1 };
		int[] result = productExceptSelf(input);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		long sum = 1;
		boolean allZero = true;
		int zeroNum = 0;
		boolean contineZero = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				sum *= nums[i];
				allZero = false;
				continue;
			}
			contineZero =  true;
			zeroNum++;
			if(zeroNum==2){
				return result;
			}
		}
		if (allZero) {
			sum = 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if(contineZero){
					result[i] = 0;
				}else{
					result[i] = (int) (sum / nums[i]);
				}
				
			} else {
				result[i] = (int) sum;
			}
		}
		return result;
	}
}
