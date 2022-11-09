package school;

public class Student extends Person {

    String classroom;

    public Student(String name, String classroom) {
        super(name);
        this.classroom = classroom;
    }

    public void study() {
        System.out.println(String.format("Bonjour, je m'appelle %s et je suis en classe de %s." , this.name, this.classroom));
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    
}
