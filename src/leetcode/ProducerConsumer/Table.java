package leetcode.ProducerConsumer;

/**
 * 类描述
 * 
 * @author luoshuoyan
 * @date 2016年8月3日
 */
public class Table{
	private final String[] cakes;// 利用数组作为缓冲区
	private int head;
	private int tail;
	private int count;

	public Table(int count) {
		this.cakes = new String[count];
		this.head = 0;
		this.tail = 0;
		this.count = 0;
	}

	public synchronized void put(String cake) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "puts" + cake);
		while (this.count >= this.cakes.length) {
			System.out.println(Thread.currentThread().getName()
					+ "Begin waid...");
			this.wait();
			System.out.println(Thread.currentThread().getName() + "End waid...");
		}
		this.cakes[tail] = cake;
		this.tail = (this.tail + 1) % this.cakes.length;
		this.count++;
		this.notifyAll();
	}

	public synchronized String take() throws InterruptedException {
		while (this.count <= 0) {
			System.out.println(Thread.currentThread().getName()
					+ "Begin wati...");
			this.wait();
			System.out.println(Thread.currentThread().getName() + "End wati...");
		}
		String cake = this.cakes[head];
		head = (head + 1) % cakes.length;
		count--;
		this.notifyAll();
		System.out.println(Thread.currentThread().getName() + "gets");
		return cake;
	}

}
