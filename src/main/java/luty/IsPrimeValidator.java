package luty;

public class IsPrimeValidator {
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(number + "   dzieli się przez:  " + i + "  prime = ");
                return false;
            }
        }
        System.out.print(number + "  prime = ");
        return true;
    }
}
