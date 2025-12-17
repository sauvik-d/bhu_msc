public class SyncDemo {

    // Instance synchronized method: object-level lock
    public synchronized void instanceMethod(String threadName) {
        System.out.println(threadName + " entered instanceMethod on " + this);
        try {
            Thread.sleep(1000); // hold the object lock for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(threadName + " exiting instanceMethod on " + this);
    }

    // Static synchronized method: class-level lock
    public static synchronized void staticMethod(String threadName) {
        System.out.println(threadName + " entered staticMethod on " + SyncDemo.class);
        try {
            Thread.sleep(1000); // hold the class lock for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(threadName + " exiting staticMethod on " + SyncDemo.class);
    }

    public static void main(String[] args) {
        SyncDemo obj1 = new SyncDemo();
        SyncDemo obj2 = new SyncDemo(); // different instance

        // 1) Two threads using instanceMethod on DIFFERENT objects -> can run in parallel
        Thread t1 = new Thread(() -> obj1.instanceMethod("T1"), "T1");
        Thread t2 = new Thread(() -> obj2.instanceMethod("T2"), "T2");

        // 2) Two threads using staticMethod -> must serialize (same class-level lock)
        Thread t3 = new Thread(() -> SyncDemo.staticMethod("T3"), "T3");
        Thread t4 = new Thread(() -> SyncDemo.staticMethod("T4"), "T4");

        System.out.println("=== Object-level lock demo (instance synchronized) ===");
        t1.start();
        t2.start();
        joinAll(t1, t2);

        System.out.println("\n=== Class-level lock demo (static synchronized) ===");
        t3.start();
        t4.start();
        joinAll(t3, t4);
    }

    private static void joinAll(Thread... threads) {
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}