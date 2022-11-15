package LBC;

import java.util.Scanner;

public class AnonnceJob extends Annonce {

    String salary;
    String advantage;

    public AnonnceJob(String title, String salary, String advantage , String descript) {
        super(title, descript);
        this.salary = salary;
        this.advantage = advantage;
    }


    public void test() {
        System.out.println(String.format("Nous recherchons un %s, pour un salaire de %s $ , les avantages sont les suivants : %s et notre descriptif est %s" , this.title, this.salary, this.advantage, this.descript));
    }

    public void input(Scanner scan) {
        super.input(scan);
        System.out.println("Salaire : ");
        this.salary = scan.nextLine();
        System.out.println("Avantages : ");
        this.advantage = scan.nextLine();
    }

    public String toString()
    {
        String res = "";
        res += "Annonce EMPLOI\n";
        res += super.toString(); 
        res += String.format( "Salaire : %s\nAvantages : %s", this.salary, this.advantage) ;
        return res;
    } 
    
}
