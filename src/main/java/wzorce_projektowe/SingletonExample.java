package wzorce_projektowe;

import java.util.ArrayList;
import java.util.List;

public class SingletonExample {

//    private List<String> logs = new ArrayList<>();

    //prywatny konstruktor!
    private SingletonExample() {
    }

    private int counter;
//    private int counter = 0;

    //pole STATYCZNE przechowujace obiekt singleton
    //zmienne statyczne istnieja przez caly czas dzialania programu
//    private static SingletonExample instance = new SingletonExample();
    private static SingletonExample instance;

    //metoda zwracaja instancje klasy singleton jest statyczna, poniewaz inaczej nie moglibysmy jej wywolac
    //bo potrzebowalisbysmy instancji klasy!
    public static synchronized SingletonExample getInstance() {
        //inicjalizacja lazy
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public int getNext() {
        return ++counter;
    }

//    public void log(String log){
//        logs.add(log);
//    }
//
//    public List<String> getLogger(){
//        return logs;
//    }

}
