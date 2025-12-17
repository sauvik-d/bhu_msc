import java.util.*;
class Counter{
	int count = 0;
	public synchronized void increment(){
		count++;
	}
	public int getCount(){
		return count;
	}
}
public class Sync{
	public static void main(String[] args) throws InterruptedException{
		Counter cnt = new Counter();
		Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                cnt.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("With synchronization, expected = 3000, actual = " + cnt.getCount());
	}
}