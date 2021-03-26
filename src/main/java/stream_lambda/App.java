package stream_lambda;

public class App {
    public static void main(String[] args) {
        ChildrenRepository childrenRepository = new ChildrenRepository();
        childrenRepository.addChild("Arek 111");
        childrenRepository.addChild("Marek 222");
        childrenRepository.addChild("Piotr 333");

        System.out.println(childrenRepository);

        childrenRepository.setNamesToLowerCase();

        childrenRepository.setNamesToUpperCase();

    }
}
