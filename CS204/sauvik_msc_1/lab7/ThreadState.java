public class ThreadState{
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getState());
			try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread finishing work, state: " + Thread.currentThread().getState());
		});
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(200);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());
	}
}