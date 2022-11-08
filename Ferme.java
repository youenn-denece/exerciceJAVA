class Animal {
    String nom;
    String espece;
    String nourriture;
    String passion;

    public Animal (String nom, String espece, String nourriture, String passion) {
        this. nom = nom;
        this.espece = espece;
        this.nourriture = nourriture;
        this.passion = passion;
    }
    public Animal (String nom) {
        this. nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setEspece(String espece) {
        this.espece = espece;
    }
    public void setNourriturte(String nourriture) {
        this.nourriture = nourriture;
    }
    public void setPassion(String passion) {
        this.passion = passion;
    }

    public String getNom() {
        return nom;
    }
    public String getEspece() {
        return espece;
    }
    public String getNourriture() {
        return nourriture;
    }
    public String getPassion() {
        return passion;
    }

}

class Mammifere extends Animal {

    public Mammifere(String nom) {
        super(nom);
        this.espece = "mammifere";
    }
} 

class Poule extends Animal {

    public Poule(String nom) {
        super(nom);
        this.nourriture = "graines";
        this.espece = "ovipare"; 
        this.passion = "vous reveiller à pas d'heure";
    }

    public void affiche() {
        System.out.println(String.format("Je suis la poule %s, je me nourrie de %s, je suis un %s et j'aime %s", this.nom, this.nourriture, this.espece, this.passion));
    }
}

class Vache extends Mammifere {

    public Vache(String nom) {
        super(nom);
        this.nourriture = "herbes";
        this.espece = "bovin"; 
        this.passion = "brouter";
    }

    public void affiche() {
        System.out.println(String.format("Je suis la vache %s, je me nourrie d' %s, je suis un %s et j'aime %s", this.nom, this.nourriture, this.espece, this.passion));
    }
}


class Ane extends Mammifere {

    public Ane(String nom) {
        super(nom);
        this.nourriture = "foin";
        this.espece = "ovidé"; 
        this.passion = "courir";
    }

    public void affiche() {
        System.out.println(String.format("Je suis l'âne %s, je me nourrie de %s, je suis un %s et j'aime %s", this.nom, this.nourriture, this.espece, this.passion));
    }
}

public class Ferme {

    public static void main(String[] args) {

        Poule p1 = new Poule("Pondeuse");
        Vache v1 = new Vache("Pimprenelle");
        Ane a1 = new Ane("Tétu");

        p1.affiche();
        v1.affiche();
        a1.affiche();
    }
    
}
