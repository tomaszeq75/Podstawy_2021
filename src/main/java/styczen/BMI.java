package styczen;

import java.util.Scanner;

public class BMI {
    Scanner in = new Scanner(System.in);
    public float waga;
    public int wzrost;

    BMI() {
        System.out.println("podaj wagę i wzrost");
        waga = in.nextFloat();
        wzrost = in.nextInt();
        double bmi = waga / Math.pow((double) wzrost / 100, 2);
        System.out.println("BMI: " + bmi);
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Optymalne");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę");
        } else {
            System.out.println("Masz nadwagę");
        }
    }
}
