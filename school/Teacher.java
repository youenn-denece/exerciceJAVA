package school;

public class Teacher extends Staff{

    String level;

    public Teacher(String name, String level, Double salary) {
        super(name, salary);
        this.level = level;
    }

    public void sayHello() {
        System.out.println(String.format("Bonjour, je suis %s, je suis enseignant en classe de %s et mon salaire est de%8.2f $." , this.name, this.level, this.salary));

    }

    @Override
    public String toString() {
        return "Teacher [level=" + level + "]";
    }

  
}
