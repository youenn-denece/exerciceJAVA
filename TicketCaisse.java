import java.util.*;

class Ligne {
    String libel = "";
    Double prixUnitaire = 0.0;
    Double quantite = 0.0;
    Double prixTotal = 0.0;

    static Integer nbrLigne = 0;

    public Ligne(String nom, Double pu, Double qte) {
        this.libel = nom;
        this.prixUnitaire = pu;
        this.quantite = qte;
        this.prixTotal = this.quantite * this.prixUnitaire;

        nbrLigne++;
    }

    public void affLigne() {
        System.out.println(String.format("%15s %8.2f %8.2f = %8.2f", this.libel, this.prixUnitaire, this.quantite, this.prixTotal));
       
    }
}

class Ticket {
    String client = "";
    Double totalTicket = 0.0;
    
    static Integer nbrTicket = 0;

    ArrayList<Ligne> lignes = new ArrayList<>();

    public Ticket(String nom) {
        this.client = nom;
        
        nbrTicket++;
    }

    public void addAchat(Ligne l) {
        lignes.add(l);
    }
    public void affTicket() {
        System.out.println("==========================================================");
        System.out.println(String.format("client : %15s", this.client));
        for(Ligne l : lignes) {
            l.affLigne();
        }
        System.out.println(String.format("nombre de ligne : %d", Ligne.nbrLigne));
        System.out.println("Total ticket =" );
        //System.out.println(String.format("Prix Total : %d", CalculTotal.totalTicket));
        System.out.println("==========================================================");
    }
}

/* class Total {
    Double totalTicket = 0.0;

    ArrayList<Ligne> lignes = new ArrayList<>();

    public Total(Double total) {
        this.totalTicket = Ligne ;
    }

} */


class TicketCaisse {

    static ArrayList<Ligne> lignes = new ArrayList<>();
    public static void main(String[] args) {
        // totalTicket += lignes.prixTotal;

        Ticket t1 = new Ticket("toto");
        t1.addAchat(new Ligne("romarin", 7.52, 2.0));
        t1.addAchat(new Ligne("courgette", 1.23, 5.0));
        t1.addAchat(new Ligne("pomme de terre", 2.36, 1.0));
        t1.addAchat(new Ligne("tomate", 4.27, 4.0));
        t1.addAchat(new Ligne("persil", 2.50, 2.0));
        t1.addAchat(new Ligne("laitue", 1.52, 14.0));
        t1.addAchat(new Ligne("roquette", 7.52, 3.0));
        t1.affTicket();

        Ticket t2 = new Ticket("coco");
        t2.addAchat(new Ligne("romarin", 7.52, 1.0));
        t2.addAchat(new Ligne("courgette", 1.23, 3.0));
        t2.addAchat(new Ligne("pomme de terre", 2.36, 5.0));
        t2.addAchat(new Ligne("tomate", 4.27, 0.5));
        t2.addAchat(new Ligne("persil", 2.50, 1.0));
        t2.addAchat(new Ligne("essence", 1.878, 75.30));
        t2.affTicket();
        System.out.println(String.format("nombre de d'achat ce jour : %d", Ligne.nbrLigne));
        System.out.println(String.format("nombre de ticket : %d", Ticket.nbrTicket));
        System.out.println("Total journée =" );
        // System.out.println(String.format("Prix Total : %d", CalculTotal.totalTicket));
    }
}