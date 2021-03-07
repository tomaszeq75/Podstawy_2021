package personList;

import java.util.List;

public interface IPersonRepository {

    public void addPerson(String name, String surname);

    public List<String> getPersonListByName(String name);

    public List<String> getNamesOfSurname(String surname);
}
