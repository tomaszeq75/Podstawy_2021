package marzec;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ZAD37 {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);

        // uruchamiane jest tylko 5 wątków, jak jedne się skończą to uruchomią się kolejne

        for (int i = 0; i < 10; i++) {
            executor.execute(new ThreadPlaygroundRunnable("R: " + i));
        }

    }
}
