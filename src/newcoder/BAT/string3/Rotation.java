package newcoder.BAT.string3;

/** 
 * ������
 * 
 * @author luoshuoyan 
 * @date 2016��6��21��
 */
public class Rotation{
    public boolean chkRotation(String A, int lena, String B, int lenb) {
        if(lena!=lenb){
        	return false;
        } 
        return (A + A).contains(B);
    }
}
