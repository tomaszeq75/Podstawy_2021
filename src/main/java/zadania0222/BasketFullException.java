package zadania0222;

public class BasketFullException extends Exception {
    public BasketFullException() {
        super(Messages.FULL.getMessage());
    }
}
