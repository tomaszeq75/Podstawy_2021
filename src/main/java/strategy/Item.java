package strategy;

public class Item {

    private String name;
    private String barcode;
    private int price;

    public Item(String name, String barcode, int price) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getPrice() {
        return price;
    }
}
