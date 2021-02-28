package wzorce_projektowe;

import java.util.ArrayList;
import java.util.List;

public class SingletonLog {
    private SingletonLog() {}

    private static SingletonLog instance;
    private List<String> log = new ArrayList<>();

    public static SingletonLog getInstance() {
        if (instance == null) {
            instance = new SingletonLog();
        }
        return instance;
    }

    public void log(String log) {
        this.log.add(log);
    }

    public List<String> getLog() {
        return log;
    }
}
