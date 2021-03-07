package marzec;

public interface Validator {
    public static boolean validate(Parcel parcel) {
        boolean result = true;

        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() >= 300) {
            System.out.println("too big");
            result = false;
        }

        if (parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30) {
            System.out.println("too small");
            result = false;
        } else result = true;

        if ((parcel.getWeight() < 30 && !parcel.isExpress()) || (parcel.getWeight() < 15 && parcel.isExpress())) {
            result = true;
        } else {
            System.out.println("to heavy");
            result = false;
        }

        return result;
    }
}
