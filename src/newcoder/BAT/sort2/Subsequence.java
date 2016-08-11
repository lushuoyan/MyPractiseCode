package newcoder.BAT.sort2;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月15日
 */
public class Subsequence{
	public int shortestSubsequence(int[] A, int n) {
    	int l=-1;
        int r=0;
        int min=A[n-1];
        int max=A[0];
        for(int i=1;i<n;i++){
        	if(max>A[i]){
        		l=i;
        	}else{
        		max=A[i];
        	}
        }
        for(int j=n-2;j>=0;j--){
        	if(min<A[j]){
        		r=j;
        	}else{
        		min=A[j];
        	}
        }
        return l-r+1;
    }
}
