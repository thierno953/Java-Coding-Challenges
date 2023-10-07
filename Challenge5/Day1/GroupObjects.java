package Challenge5.Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjects {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("John", 23));
        person.add(new Person("Jay", 25));
        person.add(new Person("Lilith", 23));
        person.add(new Person("Ana", 25));
        person.add(new Person("Tom", 21));

        Map<Integer, List<Person>> groupedMap = new HashMap<>();

        for (Person element : person) {
            List<Person> people = groupedMap.get(element.getAge());
            if (people == null) {
                people = new ArrayList<>();
                groupedMap.put(element.getAge(), people);
            }
            // use of assignment by reference
            people.add(element);
        }
        for (Integer age : groupedMap.keySet()) {
            System.out.println(groupedMap.get(age));
        }
    }
}
