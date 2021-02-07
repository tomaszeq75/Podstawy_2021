package luty;

import java.util.ArrayList;
import java.util.List;

public class ChildrenList implements Children {

    List<String> childrenList = new ArrayList<>();

    @Override
    public void addChild(String child) {
        childrenList.add(child);
    }

    @Override
    public String getChildren() {
        String childrenListString = "";

        for (String child : childrenList) {
            childrenListString += child + "\n";
        }
        return childrenList.toString();
//        return childrenListString;
    }
}
