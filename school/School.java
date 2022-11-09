package school;

public class School {
    
    public static void main(String[] args) {

        TheSchool s1 = new TheSchool();

        s1.addPerson(new Student("Toto", "CE2"));
        
        s1.sayHello();
    }
}
