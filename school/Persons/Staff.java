package school.Persons;
public class Staff extends Person {

    Integer salary;

    public Staff(String name) {
        super(name);
        this.salary = 0;
    }

    public Staff(String name, Integer salary) {
        super(name);
        this.salary = salary;
        
    }
    
}
