import java.util.*;
public class joinT extends Thread{
	public void run(){
		for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
          	}
	}
	public static void main(String[] args) throws InterruptedException{
		joinT t1 = new joinT();
		joinT t2 = new joinT();
		joinT t3 = new joinT();

		t1.start();
        t1.join();
        System.out.println("1st Complete");
        t2.start();
        t2.join();
		System.out.println("2nd Complete");
        t3.start();
        t3.join();
        System.out.println("3rd Complete");
	}
}
