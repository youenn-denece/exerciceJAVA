package school;

public class ExtraStaff extends Staff{


    public ExtraStaff(String name, Double salary) {
        super(name, salary);
    }

    public void sayHello() {
        System.out.println(String.format("Bonjour, je suis %s, je suis le surveillant et mon salaire est de%8.2f $." , this.name, this.salary));

    }

}
