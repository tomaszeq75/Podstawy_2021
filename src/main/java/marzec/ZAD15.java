package marzec;

public enum ZAD15 {
    BMW(100, 500), FERRARI(100, 450), FIAT(90, 400), MERCEDES(80, 350), OPEL(70, 200), PORSCHE(100, 480), TOYOTA(50, 70);

    private final int price;
    private final double power;

    ZAD15(int price, double power) {
        this.price = price;
        this.power = power;
    }

    boolean isRegular() {
        if (price < 90) {
            return true;
        } else return false;
    }

    boolean isPremium() {
        return !isRegular();
    }

}
