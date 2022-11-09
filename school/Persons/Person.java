package school.Persons;

public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println(String.format("Bonjour, je m'appelle %s.", this.name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

   
