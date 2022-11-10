package school;
import java.util.ArrayList;
import school.Persons.Director;
import school.Persons.ExtraStaff;
import school.Persons.Student;
import school.Persons.Teacher;
import school.TheSchool.ClassRoom;
import school.TheSchool.TheSchool;

public class School {
    
    public static void main(String[] args) {

        TheSchool MaxJacob = new TheSchool();

        MaxJacob.addPerson(new Student("Youenn"));
        MaxJacob.addPerson(new Student("Romain"));

        MaxJacob.addPerson(new Teacher("Madame Roy",1999));
        MaxJacob.addPerson(new Teacher("Monsieur Truc",2000));

        MaxJacob.addPerson(new Director("Mr Le Directeur"));
        
        MaxJacob.addPerson(new ExtraStaff("Thomas",1320));
        
        
        MaxJacob.addClassRoom(new ClassRoom("CE2", (Teacher)MaxJacob.getStudentByName("Madame Roy")));
        MaxJacob.addClassRoom(new ClassRoom("CM2", (Teacher)MaxJacob.getStudentByName("Monsieur Truc")));

        MaxJacob.getClassRoomByLevel("CE2").addStudent((Student)MaxJacob.getStudentByName("Romain"));
        MaxJacob.getClassRoomByLevel("CM2").addStudent((Student)MaxJacob.getStudentByName("Youenn"));
       
        
        /* MaxJacob.getClassRoomByLevel("CE2").sayHello();
        MaxJacob.getClassRoomByLevel("CM2").sayHello(); */

        Student youenn = (Student)MaxJacob.getStudentByName("Youenn");
        youenn.addNote("EPS", 19);
        youenn.addNote("Maths", 18);
        youenn.addNote("Latin", 17);
        youenn.addNote("Informatique", 20);

        Student romain = (Student)MaxJacob.getStudentByName("Romain");
        romain.addNote("EPS", 9);
        romain.addNote("Maths", 8);
        romain.addNote("Latin", 7);
        romain.addNote("Informatique", 2);
        
        System.out.println(  "==================================");

        MaxJacob.getClassRoomByLevel("CE2").sayHello();
        MaxJacob.getClassRoomByLevel("CM2").sayHello();

        /* ArrayList<Student> students = MaxJacob.showStudent();
        for (Student student : students) {
            System.out.println(student);
        } */
        
        // MaxJacob.sayHello();
        /*  MaxJacob.getStudentByName("Toto").setNote(5.5);
        MaxJacob.sayHello();
        MaxJacob.getStudentByName("Toto").setName("Titi");
        MaxJacob.sayHello(); */  
    
    }

}
