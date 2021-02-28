package stream_lambda;

public class PrinterService {

    public void print(IPrinter printer, String text) {
        printer.printText(text);
    }

}
