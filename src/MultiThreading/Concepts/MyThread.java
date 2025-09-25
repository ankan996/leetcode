package MultiThreading.Concepts;

public class MyThread extends Thread {
    public void run() {
        //System.out.println("Thread is running....");
        for (int i = 1; i <= 2; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println("Hello");

    }
}
