package school.TheSchool;
import java.util.ArrayList;

import school.Devoir.Devoir;
import school.Persons.Student;
import school.Persons.Teacher;

public class ClassRoom {
    String level;
    Teacher teacher;
    
    ArrayList<Student> students = new ArrayList<>();

    public ClassRoom(String level, Teacher teacher) {
        this.level = level;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addDevoir(Devoir devoir) {
        for (Student student : this.students) {
            student.addDevoir(new Devoir(devoir, student));
        }
    }

    public void sayHello() {
            System.out.println( String.format("Niveau : %s", this.level)  );
            System.out.println( String.format("Instituteur : %s", this.teacher)  );
            for (Student student : this.students ) {
                System.out.println( String.format(" - %s", student)  );
            }
            System.out.println();
    }
    
}
