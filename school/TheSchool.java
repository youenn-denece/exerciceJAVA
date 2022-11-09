package school;

import java.util.ArrayList;

public class TheSchool {

    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    public TheSchool(ArrayList<Person> persons, ArrayList<Student> students) {
        this.persons = persons;
        this.students = students;
    }

    public Student getStudentByName(String name) {
        for (Person person : this.getPersons()) {
            if (person instanceof Student) {
                if (name == ((Student) person).getName()) {
                    return (Student) person;
                }
            }
        }
        return null;
}

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sayHello() {
        for (Person person : persons) {
           person.sayHello();
        }
    }
}