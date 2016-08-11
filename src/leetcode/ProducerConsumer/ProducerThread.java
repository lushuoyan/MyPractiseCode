package leetcode.ProducerConsumer;

import java.util.Random;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��3��
 */
public class ProducerThread extends Thread{
	private final Table table;
	private final Random random;
	private static int id = 0;

	ProducerThread(String name, Table table, long seed) {
		super(name);
		this.table = table;
		this.random = new Random(seed);
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(this.random.nextInt(1000));
				String cake = "[Cake No.]" + nextID() + " by "
						+ Thread.currentThread().getName() + "]";
				this.table.put(cake);
			}
		} catch (InterruptedException e) {

		}
	}

	public static synchronized int nextID() {
		return id++;
	}
}
