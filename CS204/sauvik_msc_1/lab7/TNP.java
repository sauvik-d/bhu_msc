import java.util.*;
class Thread1 extends Thread{
	Thread1(String name){
		super(name);
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() + " " + i + " " + Thread.currentThread().getPriority());
		}
	}
}
class TNP{
	public static void main(String[] args){
		Thread1 low = new Thread1("Low");
		Thread1 normal = new Thread1("Normal");
		Thread1 high = new Thread1("High");

		low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
	}
}