package styczen;

public class StaticCalculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        int divValue = 0;
        try {
            divValue = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Błąd - Dzielenie przez 0");
        }
        return divValue;
    }

    static int modulo(int a, int b) {
        int modValue = 0;
        try {
            modValue = a % b;
        } catch (ArithmeticException e) {
            System.out.println("Błąd - Dzielenie przez 0");
        }
        return modValue;
    }


}
