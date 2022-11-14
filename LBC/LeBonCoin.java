package LBC;

import java.util.Scanner;

public class LeBonCoin {
    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );

        System.out.println("Type d'annonce :");
        String annonceType = scan.nextLine();

        Annonce annonce = new Annonce();

        if (annonceType.equals("immo"))
            annonce = new AnnonceImmo();
        else if ( annonceType.equals( "auto" ))
            annonce = new AnnonceAuto();
        else if (annonceType.equals("job"))
            annonce = new AnonnceJob("","","","");
        else if (annonceType.equals("velo"))
            annonce = new AnnonceVelo();
        
        annonce.input(scan);
        System.out.println(annonce);
        scan.close();

    }
}
