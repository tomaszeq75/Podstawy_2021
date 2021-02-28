package luty;

public class SumOfDigitsHelper {

    private int sumOfDigits;

    public SumOfDigitsHelper(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isDigit(ch)) {
                int numericValue = Character.getNumericValue(ch);
                sumOfDigits += numericValue;
            }
        }
    }

    public int getSumOfDigits() {
        return sumOfDigits;
    }
}
