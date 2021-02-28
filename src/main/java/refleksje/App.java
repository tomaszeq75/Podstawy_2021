package refleksje;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        assert args.length > 0;

        List<String> texts = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        for (String item : args) {
            Integer num = null;
            try {
                num = Integer.parseInt(item);
                ints.add(num);
            } catch (NumberFormatException e) {
                texts.add(item);
            }
        }

        System.out.println(texts);
        System.out.println(ints);
    }

    private static void carDemo() throws IllegalAccessException, NoSuchFieldException {
        Car car = new Car("zzz", "Golf");
        System.out.println(car.toString());

        Field[] fields = car.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " " + field.get(car));
        }

        Scanner in = new Scanner(System.in);
        System.out.println("podaj vin");
        String myVin = in.nextLine();

        Field vin = car.getClass().getDeclaredField("vin");
        vin.setAccessible(true);
        vin.set(car, myVin);

        System.out.println(car.toString());
    }

    private static void footballPlayerDemo() throws NoSuchFieldException, IllegalAccessException {
        FootballPlayer footballPlayer = new FootballPlayer("Rambo", "Terminator");
//        FootballPlayer footballPlayer = new FootballPlayer("", "Rambo Terminator");
        System.out.println(footballPlayer);

        //pobieramy pola klasy
        Field[] fields = footballPlayer.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        //pobieramy jedno konkretne pole, musimy podac prawidlowa nazwe pola
        Field name = footballPlayer.getClass().getDeclaredField("name");
        //zmieniamy modyfikator dostepu pola
        name.setAccessible(true);
        //settujemy nowa wartosc pola
        name.set(footballPlayer, "Psikus");
        //pobieramy konkretne pole, zwroccie uwage na skladnie name.get(footballPlayer)
        String footballPlayerName = (String) name.get(footballPlayer);
        System.out.println(footballPlayerName);

        System.out.println(footballPlayer);
    }
}