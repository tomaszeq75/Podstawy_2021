package wzorce_projektowe;

import java.util.Iterator;
import java.util.Optional;

public interface IChildrenRepository {

    boolean addChild(String child);

    String getChildren();

    void sortChildren();

    void removeDuplicates();

    void setNamesToUpperCase();

    void setNamesToLowerCase();

    Iterator<Child> iterator();
}
