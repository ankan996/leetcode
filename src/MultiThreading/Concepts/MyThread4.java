package MultiThreading.Concepts;

public class MyThread4 extends Thread {
    public void run() {
        while(true) {
            System.out.println("Hello World !");
        }
    }

    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        myThread4.setDaemon(true);
        MyThread4 t1 = new MyThread4();
        t1.start();
        myThread4.start();
        System.out.println("Main done");
    }
}
