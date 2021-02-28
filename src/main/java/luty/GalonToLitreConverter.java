package luty;

public class GalonToLitreConverter {
    int end = 100;
    double galonInLitres = 3.7854;
    double[] conversions = new double[end];

    public GalonToLitreConverter() {
        fillTable();
        print();
    }

    private void fillTable() {
        for (int i = 0; i < end; i++) {
            conversions[i] = (i + 1) * galonInLitres;
        }
    }

    private void print() {
        for (int i = 0; i < end; i++) {
            System.out.printf("%d galonów to %.2f litrów\n", i + 1, conversions[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

}
