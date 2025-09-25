package MultiThreading.DurgaSir;

public class MyThread extends Thread {

    //constructor
    MyThread(ThreadGroup g, String name) {
        super(g, name);
    }

    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
