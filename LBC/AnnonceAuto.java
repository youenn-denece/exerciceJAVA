package LBC;

import java.util.Scanner;

public class AnnonceAuto extends Annonce {
    
    String km;
    String fuel;

    public AnnonceAuto(String title, String price, String km, String fuel, String descript) {
        super(title, price, descript);
        this.km = km;
        this.fuel = fuel;
    }

    public AnnonceAuto() {
    }

    public void test() {
        System.out.println(String.format("Je suis une %s, je coute %s $ , j'ai %s kilometres je roule au %s et mon descriptif est %s" , this.title, this.price, this.km, this.fuel, this.descript));
    }

    public void input(Scanner scan) {
        super.input(scan);
        System.out.println("Kilométrage : ");
        this.km = scan.nextLine();
        System.out.println("Carburant : ");
        this.fuel = scan.nextLine();
    }
    

    public String toString()
    {
        String res = "";
        res += "Annonce VEHICULE\n";
        res += super.toString(); 
        res += String.format( "Carburant : %s\nKilométrage :%s", this.fuel, this.km) ;
        return res;
    } 
}
