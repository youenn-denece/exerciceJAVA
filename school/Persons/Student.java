package school.Persons;
import school.Note.ManagerNote;
import school.Note.Note;

public class Student extends Person {

    ManagerNote note = new ManagerNote();
    
    public Student(String name) {
        super(name);
    }

    public void addNote(String subject, Integer note)
    {
        this.note.addNote(new Note(note, subject));
    }

    public String toString() {
        return String.format("Eleve : %s   %s", this.name, this.note);
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
