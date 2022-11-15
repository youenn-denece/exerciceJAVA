package LBC;

import java.util.Scanner;

public class Annonce {

    protected String title;
    protected String price;
    protected String descript;
    
    public Annonce(String title, String price, String descript) {
        this.title = title;
        this.price = price;
        this.descript = descript;
    } 

    public Annonce(String title,  String descript) {
        this.title = title;
        this.descript = descript;
    }

    public Annonce() {
    }

    public void input(Scanner scan) {
        System.out.println("Titre : ");
        this.title = scan.nextLine();
        System.out.println("Prix : ");
        this.price = scan.nextLine();
        System.out.println("Descriptif : ");
        this.descript = scan.nextLine();
    
    }

    public String toString()
    {
        return String.format("A vendre : %s \nPrix: %s $\nDescription : %s \n" , this.title, this.price, this.descript) ;
    } 

}
