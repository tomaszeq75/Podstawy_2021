package wzorce_projektowe;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        ChildrenRepository childrenRepository = new ChildrenRepository();
        childrenRepository.addChild("Adam 123");
        childrenRepository.addChild("333");
        childrenRepository.addChild("Piotr 123");
        childrenRepository.addChild("");
        childrenRepository.addChild("Tomek 123");

        System.out.println(SingletonLog.getInstance().getLog());
        Iterator<Child> iterator = childrenRepository.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    private static void examples() {
        // nie moge stworzyc obiektu klasy, ktora ma prywatny konstruktor
//        SingletonExample singletonExample = new SingletonExample();

        for (int i = 0; i < 5; i++) {
            System.out.println(SingletonExample.getInstance().getNext());
        }

        System.out.println("cos sie dzieje");

        for (int i = 0; i < 5; i++) {
            System.out.println(SingletonExample.getInstance().getNext());
        }
    }

}
