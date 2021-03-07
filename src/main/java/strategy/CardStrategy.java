package strategy;

public class CardStrategy implements IPaymentStrategy {

    private String email;
    private int cardNumber;

    public CardStrategy(String email, int cardNumber) {
        this.email = email;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment using card. Amount " + amount);
    }
}
