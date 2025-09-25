package MultiThreading.DurgaSir;

public class ThreadGroupDemo3 {
    public static void main(String[] args) throws Exception {

        // creating a parent TG
        ThreadGroup pg = new ThreadGroup("Parent-Group");

        // creating a child TG
        ThreadGroup cg = new ThreadGroup(pg, "Child-Group");

        MyThread t1 = new MyThread(pg, "Child-Thread-1");
        MyThread t2 = new MyThread(pg, "Child-Thread-2");

        t1.start();
        t2.start();

        System.out.println("Active thread count: " + pg.activeCount());
        System.out.println("Active thread group count: " + pg.activeGroupCount());

        pg.list();

        Thread.sleep(10000);
        System.out.println("Active thread count: " + pg.activeCount());
        System.out.println("Active thread group count: " + pg.activeGroupCount());

        pg.list();
    }
}
