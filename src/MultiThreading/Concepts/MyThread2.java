package MultiThreading.Concepts;

public class MyThread2 extends Thread{
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running....");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2();
        t1.start();
        t1.interrupt();

    }
}
