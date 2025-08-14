package college;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("MAX_PRIORITY_THREAD");
        MyThread t2 = new MyThread("MIN_PRIORITY_THREAD");
        MyThread t3 = new MyThread("NORM_PRIORITY_THREAD");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    } 

}
