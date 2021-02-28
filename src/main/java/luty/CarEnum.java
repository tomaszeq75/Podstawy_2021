package luty;

public enum CarEnum {
    FERRARI(100, 100),
    PORSCHE(50, 50),
    MERCEDES(70, 70),
    BMW(70, 50),
    OPEL(50, 70),
    FIAT(100, 70),
    TOYOTA(50, 100);

    int price, power;

    CarEnum(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public boolean isPremium() {
        return !isRegular();
    }

    public boolean isRegular() {
        return true;
    }

    public boolean isFasterThan(CarEnum car) {
        int comparison = Integer.compare(this.power, car.power);

        if (comparison > 0) {
            System.out.println(this + " jest szybszy od " + car);
            return true;
        } else {
            System.out.println(this + " nie jest szybszy od " + car);
            return false;
        }
    }


}
