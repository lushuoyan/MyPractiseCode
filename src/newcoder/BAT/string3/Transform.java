package newcoder.BAT.string3;

/** 
 * 类描述
 * 
 * @author luoshuoyan 
 * @date 2016年6月21日
 */
public class Transform{
    public boolean chkTransform(String A, int lena, String B, int lenb) {
        char[] charArr =new char[58];
        if(lena != lenb){
            return false;
        }
        char[] chas1 = A.toCharArray();
        char[] chas2 = B.toCharArray();
        for(int i = 0; i < chas1.length; i++){
        	charArr[chas1[i]]++;
        }
        for(int i = 0; i < chas2.length; i++){
            if(charArr[chas2[i]]-- == 0){
                return false;
            }
        }
        return true;
    }
}
