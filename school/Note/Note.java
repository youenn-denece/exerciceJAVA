package school.Note;

public class Note {
    Double note;
    String matiere;

    // static int nbrNote;
    
    public Note(Double note, String matiere) {
        this.note = note; 
        this.matiere = matiere;

        // nbrNote++;
    }

    public void showNote() {
        System.out.println(String.format("La dernière note est %2.2f/20 en %s.", this.note, this.matiere));
        
    }

    public static void add(float p_note) {
    }

}
