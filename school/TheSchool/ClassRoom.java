package school.TheSchool;
import java.util.ArrayList;
import school.Persons.Student;

public class ClassRoom {
    String name;
    ArrayList<Student> students;

    public ClassRoom(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void sayHello() {
        System.out.println(String.format("Bienvenue dans la classe de %s.", this.name));
    }

     public void showStudents() {
        for(Student student : students) {
            System.out.println(String.format("L'éleve %s a pour note %2.2f", student.name, student.note));
        }
    }

}
