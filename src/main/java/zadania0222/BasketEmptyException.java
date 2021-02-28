package zadania0222;

public class BasketEmptyException extends Exception {
    public BasketEmptyException() {
        super(Messages.EMPTY.getMessage());
    }
}
