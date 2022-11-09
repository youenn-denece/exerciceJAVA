package school;

import java.util.ArrayList;

public class School {
    
    public static void main(String[] args) {

        TheSchool s1 = new TheSchool(new ArrayList<Person>(), null);

        s1.addPerson(new Student("Toto", "CE2", 3.5));
       // s1.addPerson(new Director("Mr Le Directeur"));
        s1.sayHello();

        s1.getStudentByName("Toto").setNote(5.5);;

        s1.sayHello();

    }
}
