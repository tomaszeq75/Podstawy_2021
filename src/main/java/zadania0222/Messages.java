package zadania0222;

public enum Messages {
    FULL("The basket is full"),
    EMPTY("The basket is empty"),
    ITEMS("Amount of items in the basket: ");

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
