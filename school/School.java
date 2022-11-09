package school;
import school.Note.ManagerNote;
import school.Note.Note;
import school.Persons.Director;
import school.Persons.ExtraStaff;
import school.Persons.Student;
import school.Persons.Teacher;
import school.TheSchool.ClassRoom;
import school.TheSchool.TheSchool;

public class School {
    
    public static void main(String[] args) {

        TheSchool MaxJacob = new TheSchool();
        ClassRoom CE2 = new ClassRoom("CE2");
        ManagerNote n1 = new ManagerNote( 17.5, "Français");

        MaxJacob.addPerson(new Director("Mr Le Directeur"));
        MaxJacob.addPerson(new Teacher("Madame Roy", "CE2",1999.9));
        MaxJacob.addPerson(new Teacher("Monsieur Truc", "CE1",2000.0));
        MaxJacob.addPerson(new Teacher("Madame Machin", "CP",2105.3));
        MaxJacob.addPerson(new ExtraStaff("Thomas",1320.2));
        MaxJacob.addPerson(new Student("Toto", "CE2", 3.5));
        MaxJacob.addPerson(new Student("Youenn", "CE1", 12.0));
        MaxJacob.addPerson(new Student("Romain", "CP", 11.0));
        
        MaxJacob.addClassRoom(new ClassRoom("CE2"));
        MaxJacob.sayHello();
        /*  MaxJacob.getStudentByName("Toto").setNote(5.5);
        MaxJacob.sayHello();
        MaxJacob.getStudentByName("Toto").setName("Titi");
        MaxJacob.sayHello(); */

        CE2.addStudent(new Student("Toto", "CE2", 3.5));
        CE2.showStudents();

        // n1.addNote(new Note( 18.0, "Français"));
        n1.showNote(); // TODO a résoudre
       
    }
}
