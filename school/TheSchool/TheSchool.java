package school.TheSchool;
import java.util.ArrayList;
import school.Persons.Person;

public class TheSchool {

    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<ClassRoom> classRooms = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }
    
    public void addClassRoom(ClassRoom classRoom) {
        classRooms.add(classRoom);
    }

    public Person getStudentByName(String nameToBeFound) {
        for (Person person : persons) {
            if (person.name.equals(nameToBeFound)) 
                    return person;
        }
        return null;
    }

    public void sayHello() {
        for (Person person : persons) {
            person.sayHello();
        }
        for (ClassRoom classRoom : classRooms) {
            classRoom.sayHello();
        }
    }

    /* public void showStudents() {
        for (ClassRoom classRoom : classRooms) {
            classRoom.showStudents();
        }
    } */


    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    
}