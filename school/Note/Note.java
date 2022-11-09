package school.Note;

import java.util.Date;

public class Note {
    Double note;
    String matiere;
    Date dateNote;

    static int nbrNote;

    public Note() {
        nbrNote++;
    }
    
    public Note(Double note, String matiere) {
        this.note = note; 
        this.matiere = matiere;

        nbrNote++;
    }
    
    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Date getDateNote() {
        return dateNote;
    }

    public void setDateNote(Date dateNote) {
        this.dateNote = dateNote;
    }

    public static int getNbrNote() {
        return nbrNote;
    }

    public static void setNbrNote(int nbrNote) {
        Note.nbrNote = nbrNote;
    }

    @Override
    public String toString() {
        return "Note [note=" + note + ", matiere=" + matiere + ", dateNote=" + dateNote + "]";
    }
    
    
}
