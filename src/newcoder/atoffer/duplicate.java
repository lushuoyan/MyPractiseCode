package newcoder.atoffer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月30日
 */
public class duplicate{
	// Parameters:
	// numbers: an array of integers
	// length: the length of array numbers
	// duplication: (Output) the duplicated number in the array number,length of
	// duplication array is 1,so using duplication[0] = ? in implementation;
	// Here duplication like pointor in C/C++, duplication[0] equal *duplication
	// in C/C++
	// 这里要特别注意~返回任意重复的一个，赋值duplication[0]
	// Return value: true if the input is valid, and there are some duplications
	// in the array number
	//
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		boolean[] temp = new boolean[length];
		for (int i = 0; i < length; i++) {
			if(temp[numbers[i]]){
				duplication[0] = numbers[i];
				return true;
			}else{
				temp[numbers[i]] = true;
			}
		}
		return false;
	}
}
