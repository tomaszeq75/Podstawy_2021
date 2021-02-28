package zadania0222;

public class Basket {
    private int amountOfItems;
    private int min = 0;
    private int max = 10;

    public Basket() {
        this(0);
    }

    public Basket(int amountOfItems) {
        this.amountOfItems = amountOfItems;
    }

    public void addToBasket() throws BasketFullException {
        if (amountOfItems == max) {
            throw new BasketFullException();
        }

        amountOfItems++;
        System.out.println(Messages.ITEMS.getMessage() + amountOfItems);
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (amountOfItems == min) {
            throw new BasketEmptyException();
        }

        amountOfItems--;
        System.out.println(Messages.ITEMS.getMessage() + amountOfItems);
    }

    public int getAmountOfItems() {
        return amountOfItems;
    }
}
