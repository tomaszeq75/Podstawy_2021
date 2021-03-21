package marzec;

public class MyThread_34 extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
//        System.out.println(Thread.currentThread().getName());
    }
}
