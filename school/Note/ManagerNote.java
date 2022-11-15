package school.Note;

import java.util.ArrayList;

public class ManagerNote {

    ArrayList<Note> notes = new ArrayList<>();

    public ManagerNote() {}

    public void addNote(Note n) {
        this.notes.add(n);
    }

    public String toString()
    {
        String result = "";
        for (Note n : this.notes) {
            result += n;
        }
        return "[" + result + "]" ;
    }

}
