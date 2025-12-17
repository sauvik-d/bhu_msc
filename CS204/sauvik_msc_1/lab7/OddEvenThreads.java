import java.util.*;
class OddPrinter implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i % 2 != 0)
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
class EvenPrinter implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i % 2 == 0)
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
public class OddEvenThreads {
    public static void main(String[] args) {
        Runnable oddTask = new OddPrinter();
        Runnable evenTask = new EvenPrinter();

        Thread oddThread = new Thread(oddTask, "OddThread");
        Thread evenThread = new Thread(evenTask, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}