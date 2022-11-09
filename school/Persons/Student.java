package school.Persons;

import java.util.ArrayList;

import school.TheSchool.TheSchool;

public class Student extends Person {

    String classroom;
    Double note;

    public Student(String name, String classroom, Double note) {
        super(name);
        this.classroom = classroom;
        this.note = note;
    }

    public void sayHello() {
        System.out.println(String.format("Bonjour, je m'appelle %s, je suis en classe de %s et ma dernière note est de %s/20." , this.name, this.classroom, this.note));
    }

    public ArrayList<Student> getStudentByNote(Double note, TheSchool school) {
        ArrayList<Student> students = new ArrayList<>();
            for (Person person : school.getPersons()) {
                if (person instanceof Student) {
                    if (note == ((Student) person).getNote()) {
                        students.add ((Student) person);
                    }
                }
                return students;
            }
            return null;
    }

    public Double getNote() {
        return note;
    }
    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setNote(Double note) {
        this.note = note;
    }
    
}
