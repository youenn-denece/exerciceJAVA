package school.Persons;

public class Director extends Person {

    public Director(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println(String.format("Bonjour, appellez moi %s." , this.name));
    }
    
}
