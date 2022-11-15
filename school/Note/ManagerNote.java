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

    /* 
    public void allNote() {
        for(int i=0; i<this.notes.size(); i++) {
            Note n = this.notes.get(i);
            System.out.println(n);
        }
        for(Note n : this.notes) {
            System.out.println(n);
        }
    }

    public void showNotes() {
        for(Note note : notes) {
            System.out.println(String.format("La dernière note est %2.2f/20 .", note)); // TODO mauvais string format
        }
    }
 */
}
