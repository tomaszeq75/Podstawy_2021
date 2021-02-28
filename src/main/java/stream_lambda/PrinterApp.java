package stream_lambda;

public class PrinterApp {

    public static void main(String[] args) {

        PrinterService service = new PrinterService();
// uzywamy klasy implementujacej interfejs
//        service.print(new LowerCasePrinter(), "TEKST DO WYDRUKU");

//implementacja klasa anonimowa
//        IPrinter iPrinter = new IPrinter() {
//            @Override
//            public void printText(String text) {
//                System.out.println(text.toLowerCase());
//            }
//        };
//        service.print(iPrinter, "TEKST DO WYDRUKU");


        //lambda
        service.print(text -> System.out.println(text.toLowerCase()), "DUZE");
//        typ nie jest potrzebny
//        service.print((String text) -> System.out.println(text.toLowerCase()), "DUZE");

    }

}
