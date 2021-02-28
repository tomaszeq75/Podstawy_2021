package styczen;

public class OuterClass {

    static class InnerStaticClass {

        public void print() {
            System.out.println("inner.print");
        }

        public static void printStatic() {
            System.out.println("inner.printStatic");
        }

    }

    class InnerRegularClass {
    }


}
