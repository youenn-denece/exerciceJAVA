package LBC;


import java.sql.*;
import java.util.Scanner;

public class LeBonCoin {
    public static void main(String[] args) {

        try
        {  
            // connexion au serveur de la DB
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bibliotheque","root","");  
            
            // creation d'un environement de requete
            Statement stmt = con.createStatement();  

            // premiere requete qui attend des données, donc un retour
            ResultSet rs = stmt.executeQuery( "select * from auteur" );  
            // enumération des données reçues dans de ResultSet    
            while(rs.next())  
                System.out.println( rs.getInt(1) + "  " + rs.getString(2));  

            // seconde requete insertion dans la DB avec executeUPDATE qui permet de transferer des donnée et qui n'attend pas de retour  
            stmt.executeUpdate("insert into auteur ( nom, prenom ) VALUES ('zoro', 'delavegua')");  

            // troisième requete qui attend des données, donc un retour
            rs = stmt.executeQuery("select * from auteur");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));  

            con.close();  
        }
        catch(Exception e)
        { 
            System.out .println(e);
        }  

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
