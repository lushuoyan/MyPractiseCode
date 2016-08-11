package newcoder.BAT.string3;

import java.util.Arrays;
import java.util.Comparator;

/** 
 * ������
 * 
 * @author luoshuoyan 
 * @date 2016��6��21��
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
        // �����µıȽϷ�ʽ����
        Arrays.sort(strs, new MyComparator());
        String res = "";
        for (int i = 0; i < n; i++) {
            res += strs[i];
        }
        return res;
    }
}
