package wzorce_projektowe;

import java.util.*;
import java.util.stream.Collectors;

public class ChildrenRepository implements IChildrenRepository {

    private List<Child> children = new ArrayList<>();

    @Override
    public boolean addChild(String childDescrption) {
        Child child;
        try {
            child = new Child(childDescrption);
        } catch (IllegalArgumentException e) {
            SingletonLog.getInstance().log(e.getMessage());
            return false;
        }
        SingletonLog.getInstance().log(child.toString());
        return children.add(child);
    }

    @Override
    public String getChildren() {
        return children.toString();
    }

    @Override
    public void sortChildren() {
//        Collections.sort(children);
//        children = children.stream().sorted().collect(Collectors.toList());
//        children = children.stream().sorted((Child a, Child b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
//        children = children.stream().sorted(Comparator.comparing(Child::getName).thenComparing(Child::getPesel)).collect(Collectors.toList());
//        children = children.stream().sorted(Comparator.comparing(Child::getName, Comparator.reverseOrder()).thenComparing(Child::getPesel)).collect(Collectors.toList());
    }

    @Override
    public void removeDuplicates() {
        children = new ArrayList<>(new HashSet<>(children));
    }

    @Override
    public void setNamesToUpperCase() {
        children = children.stream().map(a -> new Child(a.getName().toUpperCase(), a.getPesel())).collect(Collectors.toList());
    }

    @Override
    public void setNamesToLowerCase() {
        children = children.stream().map(a -> new Child(a.getName().toLowerCase(), a.getPesel())).collect(Collectors.toList());
    }

    @Override
    public Iterator<Child> iterator() {
        return new ChildrenIterator(children);
    }

    @Override
    public String toString() {
        return "ChildrenRepository{" +
                "children=" + children +
                '}';
    }

    private class ChildrenIterator implements Iterator<Child> {
        public ChildrenIterator(List<Child> childs) {
            this.childs = childs;
        }

        private List<Child> childs;
        private int position;

        public boolean hasNext() {
            if (position < childs.size() && childs.get(position) != null) {
                return true;
            }
            return false;
        }

        @Override
        public Child next() {
            return childs.get(position++);
        }

    }
}



