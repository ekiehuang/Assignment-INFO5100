package hyj_assignment7;

public class ReverseHello implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        ReverseHello reverseHi = new ReverseHello();
        for (int i = 50; i >= 1; i--) {
            Thread hi = new Thread(reverseHi);
            hi.setName("Thread " + i);
            hi.start();
            hi.join();
        }
    }

    public void run() {
        Thread hi = new Thread();
        String threadName = Thread.currentThread().getName();
        System.out.println("Hello from " + threadName);
    }
}