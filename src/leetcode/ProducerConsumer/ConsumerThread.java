package leetcode.ProducerConsumer;

import java.util.Random;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��3��
 */
public class ConsumerThread extends Thread{
	private final Table table;
	private final Random random;

	public ConsumerThread(String name, Table table, long seed) {
		super(name);
		this.table = table;
		this.random = new Random(seed);
	}

	public void run() {
		try {
			while (true) {
				String cake = table.take();
				Thread.sleep(this.random.nextInt(1000));
			}
		} catch (InterruptedException e) {

		}
	}
}
