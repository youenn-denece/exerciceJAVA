package school.Persons;
import java.util.ArrayList;

import school.Devoir.Devoir;
import school.Note.ManagerNote;
import school.Note.Note;

public class Student extends Person {

    ManagerNote note = new ManagerNote();
    ArrayList<Devoir> devoirs = new ArrayList<>();
    
    public Student(String name) {
        super(name);
    }

    public void addNote(String subject, Integer note) {
        this.note.addNote(new Note(note, subject));
    }

    public void addDevoir(Devoir devoir) {
        this.devoirs.add(devoir);
    }

    public String toString() {
        String result = "";
        for (Devoir devoir : devoirs) {
            result += devoir;
            result += ",";
        }

        return String.format("Eleve(%s, %s, %s)", this.name, this.note, result);
    }

    /* public float get_average()
    {
        float avg = 0;
        for(float n : notes)
        {
            avg += n;
        }
        avg /= notes.size();
        return avg;
    } */
}
