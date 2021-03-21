package marzec;

public class ZAD34 extends Thread{
    public static void main(String[] args) {
        MyThread_34 t1 = new MyThread_34();
        t1.start();

        MyRunnable_35 r1 = new MyRunnable_35();
        r1.run();

        Thread t2 = new Thread(r1);
        t2.start();

        ThreadPlaygroundRunnable tp = new ThreadPlaygroundRunnable("wątek");

        Thread tpt = new Thread(tp);
        tp.run();  // wykona się w całości
        tpt.start();

        System.out.println("-- end --");

    }

}
