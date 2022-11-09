package school.Note;

import java.util.ArrayList;

public class ManagerNote {

    private ArrayList<Note> notes = new ArrayList<>();

    public ManagerNote() {
    }

    public void addNote(Note n) {
        this.notes.add(n);
    }    

    public void allNote() {
        for(int i=0; i<this.notes.size(); i++) {
            Note n = this.notes.get(i);
            System.out.println(n);
        }
        for(Note n : this.notes) {
            System.out.println(n);
        }
    }


}
