package newcoder.BAT.string3;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年6月21日
 */
class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}
}

public class IdenticalTree{
	public boolean chkIdentical(TreeNode A, TreeNode B) {
		String t1Str = serialByPre(A);
		String t2Str = serialByPre(B);
		return getIndexof(t1Str, t2Str) != -1;
	}

	static String serialByPre(TreeNode head) {
		if (head == null) {
			return "#!";
		}
		String res = head.val + "!";
		res += serialByPre(head.left);
		res += serialByPre(head.right);
		return res;
	}

	public int getIndexof(String str, String match) {
		if (str == null || match == null || match.length() < 1
				|| match.length() > str.length())
			return -1;
		char[] ss = str.toCharArray();
		char[] ms = match.toCharArray();
		int next[] = getNextArray(ms);
		int si = 0;
		int mi = 0;
		while (si < ss.length && mi < ms.length) {
			if (ss[si] == ms[mi]) // 如果两个字符相等，子串和主串都往后移动
			{
				si++;
				mi++;
			} else if (next[mi] == -1) // 此时说明mi是第一个字符,且第一个字符与si不一样，则si++
			{
				si++;
			} else {
				mi = next[mi]; // 此时mi向前移动到next[mi]的位置
			}
		}
		return mi == ms.length ? si - mi : -1; // 此时若mi==ms.length则表示已经匹配到最后一个了。

	}

	public static int[] getNextArray(char[] ms) {
        if (ms.length == 1) {
            return new int[] { -1 };
        }
        int[] nextArr = new int[ms.length];
        nextArr[0] = -1;
        nextArr[1] = 0;
        int pos = 2;
        int cn = 0;
        while (pos < nextArr.length) {
            if (ms[pos - 1] == ms[cn]) {
                nextArr[pos++] = ++cn;
            } else if (cn > 0) {
                cn = nextArr[cn];
            } else {
                nextArr[pos++] = 0;
            }
        }
        return nextArr;
    }
	
	
	public static void main(String[] args) {
		String input = "abcabcacac";
		int[] res = getNextArray(input.toCharArray());
		for(int i = 0 ; i < res.length;i++){
			System.out.print(res[i]);
		}
	}
}
