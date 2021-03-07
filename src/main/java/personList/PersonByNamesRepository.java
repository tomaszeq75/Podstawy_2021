package personList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonByNamesRepository implements IPersonRepository {

    Map<String, List<String>> names = new HashMap<>();

    @Override
    public void addPerson(String name, String surname) {
        if (names.containsKey(name)) {
            names.get(name).add(surname);
        } else {
            List<String> surnames = new ArrayList<>();
            surnames.add(surname);
            names.put(name, surnames);
        }
    }

    @Override
    public List<String> getPersonListByName(String name) {
        return names.get(name);
    }

    @Override
    public List<String> getNamesOfSurname(String surname) {
        List<String> result = names.entrySet().stream()
                .filter(stringListEntry -> stringListEntry.getValue().contains(surname))
                .map(stringListEntry -> stringListEntry.getKey())
                .collect(Collectors.toList());

        return result;
    }

    public void print() {
        System.out.println("---");

        for (Map.Entry<String, List<String>> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
