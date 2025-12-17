import java.util.*;
public class DT extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon Running!");
		}
		else{
			System.out.println("Normal Running!");
		}
	}
	public static void main(String[] args){
		DT t1 = new DT();
		DT t2 = new DT();

		t1.setDaemon(true);
		t1.start();
		t2.start();
	}
}
