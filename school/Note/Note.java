package school.Note;

public class Note {
    Integer note;
    String subject;
    String date = "11/11/2022";

    // static int nbrNote;
    
    public Note(Integer note, String subject) {
        this.note = note; 
        this.subject = subject;

        // nbrNote++;
    }

    public Note(Integer note, String subject, String date) {
        this.note = note; 
        this.subject = subject;
        this.date = date;
    }

    @Override
    public String toString() {
        return  subject + ": " + note + "/20 " + this.date + ".";
    } 
}
