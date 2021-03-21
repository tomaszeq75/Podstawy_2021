package marzec;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ZAD32 {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", "red", CarType.CABRIO);
        Car c2 = new Car("Audi", "blue", CarType.COUPE);

        List<Car> carList = new LinkedList<>();
        carList.add(c1);
        carList.add(c2);

        String  outPath = "cars.txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(outPath));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(carList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Car> caListReaded = null;
        try (FileInputStream fileInputStream = new FileInputStream(new File(outPath));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            caListReaded = (List<Car>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(caListReaded);
    }


}
