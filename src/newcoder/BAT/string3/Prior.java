package newcoder.BAT.string3;

import java.util.Arrays;
import java.util.Comparator;

/** 
 * 类描述
 * 
 * @author luoshuoyan 
 * @date 2016年6月21日
 */
public class Prior{
	public class MyComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return (a + b).compareTo(b + a);
        }
    }
 
    public String findSmallest(String[] strs, int n) {
        if (strs == null || n == 0) {
            return "";
        }
        // 根据新的比较方式排序
        Arrays.sort(strs, new MyComparator());
        String res = "";
        for (int i = 0; i < n; i++) {
            res += strs[i];
        }
        return res;
    }
}
