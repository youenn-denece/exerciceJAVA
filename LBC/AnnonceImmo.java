package LBC;

import java.util.Scanner;

public class AnnonceImmo extends Annonce {

    String surface;
    String nbrPiece;

    public AnnonceImmo(String title, String price, String surface, String nbrPiece, String descript) {
        super(title, price, descript);
        this.surface = surface;
        this.nbrPiece = nbrPiece;        
    }

    public AnnonceImmo() {        
    }

    public void input(Scanner scan) {
        super.input(scan);
        System.out.println("Surface : ");
        this.surface = scan.nextLine();
        System.out.println("Nombre de pieces : ");
        this.nbrPiece = scan.nextLine();
    }

    public String toString()
    {
        String result = "";
        result += "Annonce IMMO\n";
        result += super.toString(); 
        result += String.format( "Superficie : %s m2 \nNombre de pieces : %s", this.surface, this.nbrPiece) ;
        return result;
    }
    
}
