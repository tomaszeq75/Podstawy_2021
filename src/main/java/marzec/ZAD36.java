package marzec;

public class ZAD36 {
    private static Thread t1, t2;

    public static void main(String[] args) {
        t1 = new Thread(new ThreadPlaygroundRunnable("T1"));
        t2 = new Thread(new ThreadPlaygroundRunnable("T2"));

        t1.start();
        t2.start();
    }
}
