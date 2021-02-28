package stream_lambda;

public class LowerCasePrinter implements IPrinter {
    @Override
    public void printText(String text) {
        System.out.println(text.toLowerCase());
    }
}
