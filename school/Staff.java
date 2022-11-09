package school;
public class Staff extends Person {

    Double salary;

    public Staff(String name, Double salary) {
        super(name);
        this.salary = salary;
        
    }

    public void sayHello() {
        System.out.println(String.format("Bonjour, je suis %s, je suis en salarié de l'école et mon salaire est de %s $." , this.name, this.salary));
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
}
