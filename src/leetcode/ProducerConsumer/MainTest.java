package leetcode.ProducerConsumer;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��3��
 */
public class MainTest{
	public static void main(String[] args) {
		Table table = new Table(3);
		new ProducerThread("ProducerThread-1",table,31415).start();
		new ProducerThread("ProducerThread-2",table,98321).start();
		new ProducerThread("ProducerThread-3",table,23423).start();
		
		new ConsumerThread("ConsumerThread-1",table,23423).start();
		new ConsumerThread("ConsumerThread-2",table,23423).start();
		new ConsumerThread("ConsumerThread-3",table,23423).start();
	}
}
