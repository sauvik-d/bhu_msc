import java.util.*;
import java.time.LocalTime;
public class Clock extends Thread{
	public void run(){
		for (int i = 1; i <= 10; i++) {
                LocalTime now = LocalTime.now();
                System.out.println("Time " + i + ": " + now);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Clock interrupted.");
                    break;
                }
            }
            System.out.println("Clock stopped after 10 seconds.");
	}
	public static void main(String[] args){
		Clock c1 = new Clock();
		c1.start();
	}
}