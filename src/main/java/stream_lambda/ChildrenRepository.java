package stream_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

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
                .collect(toList());
    }

    @Override
    public void setNamesToLowerCase() {
        children = children.stream()
                .map(child -> new Child(child.getName().toLowerCase(), child.getPesel()))
                .peek(child1 -> System.out.println(child1.getName()))
                .collect(toList());
        System.out.println();
    }

    @Override
    public void setNamesToUpperCase() {
        children = children.stream()
                .map(a -> new Child(a.getName().toUpperCase(), a.getPesel()))
                .peek(System.out::println)
                .collect(toList());
    }

    @Override
    public String toString() {
        return "ChildrenRepository{" +
                "children=" + children +
                '}';
    }

}
