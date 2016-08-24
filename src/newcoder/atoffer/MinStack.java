package newcoder.atoffer;

import java.util.Stack;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��24��
 */
public class MinStack{
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minstack = new Stack<Integer>();

	public void push(int node) {
		if (this.minstack.isEmpty()) {
			this.minstack.push(node);
		} else if (node <= this.min()) {
			this.minstack.push(node);
		}else{
			this.minstack.push(this.min());
		}
		this.stack.push(node);
	}

	public void pop() {
		stack.pop();
		minstack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		return minstack.peek();
	}
}
