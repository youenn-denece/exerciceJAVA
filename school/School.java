package school;

import java.util.ArrayList;

import school.Persons.Director;
import school.Persons.ExtraStaff;
import school.Persons.Person;
import school.Persons.Student;
import school.Persons.Teacher;
import school.TheSchool.TheSchool;

public class School {
    
    public static void main(String[] args) {

        TheSchool s1 = new TheSchool(new ArrayList<Person>(), null);

        s1.addPerson(new Student("Toto", "CE2", 3.5));
        s1.addPerson(new Director("Mr Le Directeur"));
        s1.addPerson(new Teacher("Madame Roy", "CE2",1999.9));
        s1.addPerson(new ExtraStaff("Thomas",1320.2));
        s1.sayHello();

       /*  s1.getStudentByName("Toto").setNote(5.5);
        s1.sayHello();

        s1.getStudentByName("Toto").setName("Titi");
        s1.sayHello(); */
    }
}
