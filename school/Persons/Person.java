package school.Persons;

public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name ;
    }
    
}

   
