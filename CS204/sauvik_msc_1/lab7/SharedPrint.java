import java.util.*;
class SyncMeth{
	public synchronized void print(String document){
		try {
            Thread.sleep(200); // simulate print time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing!");
	}
}
class SyncBlock{
	public void print(String document){
		synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " started printing: ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Thread.currentThread().getName() + " finished printing: ");
	}
}
}
public class SharedPrint{
	public static void test(String label, java.util.function.Consumer<String> printFunc){
		
		Runnable job1 = () -> printFunc.accept("Document A");
        Runnable job2 = () -> printFunc.accept("Document B");
        Runnable job3 = () -> printFunc.accept("Document C");

        Thread t1 = new Thread(job1, label + "-T1");
        Thread t2 = new Thread(job2, label + "-T2");
        Thread t3 = new Thread(job3, label + "-T3");

		t1.start();
		t2.start();
		t3.start();
	}
	public static void main(String[] args){
		SyncMeth sm = new SyncMeth();
		test("SynchronizedMethod", doc -> sm.print(doc));
		SyncBlock sb = new SyncBlock();
		test("SynchronizedMethod", doc -> sb.print(doc));
	}
}