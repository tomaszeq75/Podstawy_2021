package luty_coding;

public class OuterKlasa {
    private int[] numbers;

    public OuterKlasa(int[] numbers) {
        this.numbers = numbers;
    }

    void analyzeNumbers() {
        InnerKlasa analiza = new InnerKlasa();
        System.out.println("min " + analiza.min());
        System.out.println("max " + analiza.max());
        System.out.println("avg " + analiza.avg());
    }

    private class InnerKlasa {
        int min() {
            int min = Integer.MAX_VALUE;
            for (int num: numbers) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }

        int max() {
            int max = Integer.MIN_VALUE;
            for (int num: numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        int avg() {
            int sum = 0;
            int counter = 0;
            for (int num : numbers) {
                sum += num;
                counter++;
            }
            return sum / counter;
        }

    }
}
