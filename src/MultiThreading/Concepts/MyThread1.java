package MultiThreading.Concepts;

public class MyThread1 extends Thread {
    // create a constructor

    public MyThread1(String name) {
        super(name);
    }


    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            for (int j = 0; j < 10000; j++) {
                a = a + "a";
            }
            System.out.println(
                    " - Name: " + Thread.currentThread().getName()
             + " - Priority: " + Thread.currentThread().getPriority() +
                            " - count: " + i
            );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        MyThread1 low = new MyThread1("Low Priority Thread");
        MyThread1 medium = new MyThread1("Medium Priority Thread");
        MyThread1 high = new MyThread1("High Priority Thread");

        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        medium.start();
        high.start();


    }
}
