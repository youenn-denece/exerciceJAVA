package school.Devoir;

import java.util.*;
import school.Persons.Student;

public class Devoir {

    String title = "";
    String subject = "";
    Student student = null;

    public static ArrayList<Devoir> devoirs = new ArrayList<>();

    public Devoir(String title) {
        this.title = title;
        devoirs.add(this);
    }

    public Devoir(String title, String subject) {
        this.title = title;
        this.subject = subject;
        devoirs.add(this);
    }

    public Devoir(Devoir devoir, Student student) {
        this.title = devoir.title;
        this.subject = devoir.subject;
        this.student = student;
        devoirs.add(this);
    }

    static public void listDevoir() {
        for (Devoir devoir : devoirs) {
            System.out.println(devoir);
        }
    }

    @Override
    public String toString() {
        if (this.student == null)
            return "Devoir : Intitulé :" + title + ", Matière :" + this.subject ;
        return "Devoir : Intitulé :" + title + ", Matière :" + this.subject  + ", Elève : " + this.student.getName();
    }
}