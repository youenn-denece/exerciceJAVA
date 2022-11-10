package school.TheSchool;
import java.util.ArrayList;
import school.Persons.Person;
import school.Persons.Student;

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

    public ClassRoom getClassRoomByLevel(String levelToBeFound) {
        for (ClassRoom classRoom : this.classRooms) {
            if (classRoom.level.equals(levelToBeFound)) 
                return classRoom;
        }
        return null;
    }

    public ArrayList<Student> showStudent() {
        ArrayList<Student> list = new ArrayList<>();

        for (Person person : this.persons) {
            if (person.getClass().getSimpleName().equals("Eleve")) {
                list.add((Student) person);
            }
        }
        return list;
    }

    public ArrayList<ClassRoom> getClassRooms() {
        return classRooms;
    }
    
}