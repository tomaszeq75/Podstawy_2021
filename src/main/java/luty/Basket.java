package luty;

public class Basket {
    private int items;
    private int max;
    private int min;

    public Basket(int items) {
        this.items = items;
    }

    // krótszy zapis, chociaż w items jest zła wartość
    public void addToBasket() throws BasketFullException {
        max = 10;
        if (items++ == max) {
            throw new BasketFullException("Za dużo elementów: " + items);
        }
        System.out.println("ilość elementów w koszyku: " + items);
    }

    // dłuższy zapis
    public void removeFromBasket() throws BasketEmptyException {
        min = 0;
        if (items > min) {
            items--;
            System.out.println("ilość elementów w koszyku: " + items);
        } else {
            throw new BasketEmptyException("Za mało elementów: " + items);
        }
    }
}
