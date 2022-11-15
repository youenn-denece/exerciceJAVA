package LBC;

import java.util.Scanner;

public class AnnonceVelo extends Annonce{
    
    String etat;
    String type;

    public AnnonceVelo(String title, String price, String etat, String type, String descript) {
        super(title, price, descript);
        this.etat = etat;
        this.type = type;        
    }

    public AnnonceVelo() {        
    }

    public void input(Scanner scan) {
        super.input(scan);
        System.out.println("Etat : ");
        this.etat = scan.nextLine();
        System.out.println("Type de vélo : ");
        this.type = scan.nextLine();
    }

    public String toString()
    {
        String result = "";
        result += "Annonce VELO\n";
        result += super.toString(); 
        result += String.format( "Etat : %s \nType de vélo :  %s", this.etat, this.type) ;
        return result;
    }
    
}
