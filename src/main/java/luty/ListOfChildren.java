package luty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfChildren implements IChildren  {
    List<String> children = new ArrayList<>();

    @Override
    public boolean add(String name) {

        if (isNameValid(name)) {
            return children.add(name);
        }
        return false;
    }

    private boolean isNameValid(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isAlphabetic(name.charAt(i))) {
                return false;
            }
        }
        return true;
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
        List<String> temp = new ArrayList<>();
        for (String name : children) {
            if (!temp.contains(name)) {
                temp.add(name);
            }
        }
        children = temp;
    }

    @Override
    public void namesToUpperCase() {
        for (int i = 0; i < children.size(); i++) {
            children.set(i, children.get(i).toUpperCase());
        }
    }

    @Override
    public void namesToLowerCase() {
        for (int i = 0; i < children.size(); i++) {
            children.set(i, children.get(i).toLowerCase());
        }
    }
}
