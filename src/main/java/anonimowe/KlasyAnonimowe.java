package anonimowe;

public class KlasyAnonimowe {

    public static void main(String[] args) {

//        Calculator calculator = new CalculatorCasioSuper();
//        System.out.println(calculator.numberToString(5454));

        Calculator calculator = new Calculator() {
            @Override
            public String numberToString(int number) {
                return String.valueOf(number);
            }
        };
        System.out.println(calculator.numberToString(5454));

    }

    SuperCalculator superCalculator = new SuperCalculator() {
        @Override
        public String getSumAsString(int a, int b) {
            return null;
        }

        @Override
        public String getSumAsInt(int a, int b) {
            return "5";
        }
    };

}
