package luty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChildrenRepo implements IChildren {
    List<Child> children = new ArrayList<>();

    @Override
    public boolean add(String nameAndPesel) {
        Child child;
        try {
            child = new Child(nameAndPesel);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
        return children.add(child);
    }

    @Override
    public String getChildren() {
        return children.toString();
    }

    @Override
    public void sort() {
        Collections.sort(children);
    }

    @Override
    public void clearDuplicates() {
        List<Child> temp = new ArrayList<>();
        // todo
    }

    @Override
    public void namesToUpperCase() {

    }

    @Override
    public void namesToLowerCase() {

    }
}
