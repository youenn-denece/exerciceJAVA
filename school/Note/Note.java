package school.Note;

public class Note {
    Integer note;
    String subject;

    // static int nbrNote;
    
    public Note(Integer note, String subject) {
        this.note = note; 
        this.subject = subject;

        // nbrNote++;
    }

    @Override
    public String toString() {
        return  subject + ": " + note + "/20. ";
    } 
}
