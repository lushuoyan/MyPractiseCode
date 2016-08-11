package newcoder.BAT.string3;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��6��21��
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
			if (ss[si] == ms[mi]) // ��������ַ���ȣ��Ӵ��������������ƶ�
			{
				si++;
				mi++;
			} else if (next[mi] == -1) // ��ʱ˵��mi�ǵ�һ���ַ�,�ҵ�һ���ַ���si��һ������si++
			{
				si++;
			} else {
				mi = next[mi]; // ��ʱmi��ǰ�ƶ���next[mi]��λ��
			}
		}
		return mi == ms.length ? si - mi : -1; // ��ʱ��mi==ms.length���ʾ�Ѿ�ƥ�䵽���һ���ˡ�

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
