package ccf.ccf1503.four;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	private class TreeNode {
		private int parent;
		private int current;
		private int type;
		private  ArrayList<Integer>  childNode;

		public TreeNode(int parent, int current, int type) {
			this.parent = parent;
			this.current = current;
			this.type = type;
		}

		public TreeNode() {
			this.parent = 0;
			this.current = 0;
		}

		public void setParent(int temp) {
			this.parent = temp;
		}

		public void setCurrent(int current) {
			this.current = current;
		}

		public void setType(int type) {
			this.type = type;
		}

		public void addChild(int i) {
			this.childNode.add(i);
		}

		public int getParent() {
			return this.parent;
		}

		public int getCurrent() {
			return this.current;
		}

		public int getType() {
			return this.type;
		}
		
		public ArrayList<Integer> getChild() {
			return this.childNode;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			String firstLine = reader.readLine();
			String[] firstArray = firstLine.split(" ");
			int change = Integer.parseInt(firstArray[0]);
			int com = Integer.parseInt(firstArray[1]);
			TreeNode[] changeArray = new TreeNode[change + com + 1];
			for (int i = 0; i < change - 1; i++) {
				int temp = Integer.parseInt(firstArray[i]);
				changeArray[i + 2].setParent(temp);
				changeArray[i + 2].setType(0);
				changeArray[i + 2].setCurrent(i + 2);
				changeArray[temp].addChild(i + 1);
			}

			String secondLine = reader.readLine();
			String[] secondArray = secondLine.split(" ");
			for (int i = 0; i < com; i++) {
				int temp = Integer.parseInt(secondArray[i]);
				changeArray[change + i + 2].setParent(temp);
				changeArray[change + i + 2].setType(0);
				changeArray[temp].addChild(change + i + 2);
			}

			List<Integer> firstBFS = new ArrayList<Integer>();
			List<Integer> farthest = new ArrayList<Integer>();
			firstBFS.add(1);
			while (true) {
				if (firstBFS.size() == 0) {
					break;
				}
			}
			int max = 0;
			for (int i = 0; i < farthest.size(); i++) {
				int temp = firstBFS.get(i);
				ArrayList<Integer> chileNode = changeArray[temp].childNode;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
