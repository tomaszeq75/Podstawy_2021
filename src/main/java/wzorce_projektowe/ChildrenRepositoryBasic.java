package wzorce_projektowe;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ChildrenRepositoryBasic implements IChildrenRepository {

    private List<String> children = new ArrayList<>();

    @Override
    public boolean addChild(String child) {
        if (isValid(child)) {
            return children.add(child.trim());
        } else {
            return false;
        }
    }

    @Override
    public String getChildren() {
        return children.toString();
    }


    @Override
    public void sortChildren() {
//        Collections.sort(children);
        children.sort((String s1, String s2) -> s1.compareTo(s2));
//        children = children.stream().sorted().collect(Collectors.toList());

//        reversed order
//        children.sort((String s1, String s2) -> s2.compareTo(s1));
    }

    @Override
    public void removeDuplicates() {
//        children = new ArrayList<>(new HashSet<>(children));
        children = children.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public void setNamesToUpperCase() {
//        for (int i = 0; i < children.size(); i++) {
//            children.set(i, children.get(i).toUpperCase());
//        }

        children = children.stream().map(child -> child.toUpperCase()).collect(Collectors.toList());

    }

    @Override
    public void setNamesToLowerCase() {
        for (int i = 0; i < children.size(); i++) {
            children.set(i, children.get(i).toLowerCase());
        }
    }

    @Override
    public Iterator<Child> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "ChildrenRepository{" +
                "children=" + children +
                '}';
    }

    private boolean isValid(String child) {
        if (child == null || child.isBlank()) {
            return false;
        }
        Pattern pattern = Pattern.compile("[a-z A-Z]+");
        return pattern.matcher(child).matches();
    }

}
