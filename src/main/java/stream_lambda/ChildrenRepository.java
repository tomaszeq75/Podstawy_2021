package stream_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChildrenRepository implements IChildrenRepository {

    private List<Child> children = new ArrayList<>();

    @Override
    public boolean addChild(String childDescrption) {
        Child child;
        try {
            child = new Child(childDescrption);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return children.add(child);
    }

    @Override
    public String getChildren() {
        return children.toString();
    }

    @Override
    public void sortChildren() {
        children.sort(Comparator.comparing(Child::getName));
        // lambda
        //        children.sort((child, child2) -> child.getName().compareTo(child2.getName()));
    }

    @Override
    public void removeDuplicates() {
        children = children.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public void setNamesToUpperCase() {
        children = children.stream()
                .map(a -> new Child(a.getName().toUpperCase(), a.getPesel()))
                .collect(Collectors.toList());
    }

    @Override
    public void setNamesToLowerCase() {
        //todo
    }

    @Override
    public String toString() {
        return "ChildrenRepository{" +
                "children=" + children +
                '}';
    }

}
