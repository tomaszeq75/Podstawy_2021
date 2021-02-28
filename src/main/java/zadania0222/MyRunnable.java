package zadania0222;

public class MyRunnable implements Runnable{

    int sleepTime;
    String name;

    public MyRunnable(String name, int sleepTime) {
        this.sleepTime = sleepTime;
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
