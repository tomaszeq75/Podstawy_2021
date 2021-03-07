package marzec;

public class Magazine_7 {

    private String[] magazine;
    private int index;

    public Magazine_7(int size) {
        magazine = new String[size];
    }

    public void loadBullet(String bullet) {
        if (index < magazine.length) {
            magazine[index++] = bullet;
        } else {
            System.out.println("Full");
        }
    }

    public boolean isLoaded() {
        return index > 0;
    }

    public void shoot() {
        if (isLoaded()) {
            System.out.println(magazine[--index] + " : " + index);
        } else {
            System.out.println("empty");
        }
    }
}
