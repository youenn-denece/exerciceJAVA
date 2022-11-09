package school;

import java.util.ArrayList;

public class TheSchool {

    ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void sayHello() {
        for (Person person : persons) {
           person.study();
        }
    }
}