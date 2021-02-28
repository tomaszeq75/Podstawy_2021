package refleksje;

public class FootballPlayer {

    private String name;
    private String surname;

    public FootballPlayer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return name + surname;
//    }
}
