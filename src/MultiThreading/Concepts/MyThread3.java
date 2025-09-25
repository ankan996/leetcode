package MultiThreading.Concepts;

public class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread3 t1 = new MyThread3("Ankan");
        MyThread3 t2 = new MyThread3("Mohor");

        t1.start();
        t2.start();

    }
}
