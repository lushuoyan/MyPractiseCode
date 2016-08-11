package newcoder.BAT.string3;

/** 
 * 类描述
 * 
 * @author luoshuoyan 
 * @date 2016年6月21日
 */
public class Rotation{
    public boolean chkRotation(String A, int lena, String B, int lenb) {
        if(lena!=lenb){
        	return false;
        } 
        return (A + A).contains(B);
    }
}
