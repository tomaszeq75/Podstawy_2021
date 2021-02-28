package stream_lambda;

public interface IChildrenRepository {

    boolean addChild(String child);

    String getChildren();

    void sortChildren();

    void removeDuplicates();

    void setNamesToUpperCase();

    void setNamesToLowerCase();

}
