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

    // Setter
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
    // Getter
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
    int patte = 4;

    public Mammifere(String nom, int patte) {
        super(nom);
        this.patte = patte;
    }
} 
class Oiseau extends Animal {
    int aile = 2;

    public Oiseau(String nom, int aile) {
        super(nom);
        this.aile = aile;
    }
} 
class Poule extends Oiseau {

    public Poule(String nom, int aile) {
        super(nom, aile);
        this.nourriture = "graines";
        this.espece = "ovipare"; 
        this.passion = "vous reveiller à pas d'heure";
    }

    public void affiche() {
        System.out.println(String.format("Je suis la poule %s, je me nourrie de %s, je suis un %s, j'ai %s ailes et j'aime %s", this.nom, this.nourriture, this.espece,this.aile, this.passion));
    }
}
class Vache extends Mammifere {

    public Vache(String nom, int patte) {
        super(nom, patte);
        this.nourriture = "herbes";
        this.espece = "bovin"; 
        this.passion = "brouter";
    }

    public void affiche() {
        System.out.println(String.format("Je suis la vache %s, je me nourrie d' %s, je suis un %s, j'ai %s pattes et j'aime %s", this.nom, this.nourriture, this.espece, this.patte,  this.passion));
    }
}
class Ane extends Mammifere {

    public Ane(String nom, int patte) {
        super(nom, patte);
        this.nourriture = "foin";
        this.espece = "ovidé"; 
        this.passion = "courir";
    }

    public void affiche() {
        System.out.println(String.format("Je suis l'âne %s, je me nourrie de %s, je suis un %s, j'ai %s pattes et j'aime %s", this.nom, this.nourriture, this.espece,this.patte, this.passion));
    }
}
public class Ferme {
    public static void main(String[] args) {

        Poule p1 = new Poule("Pondeuse", 2);
        Vache v1 = new Vache("Pimprenelle", 4);
        Ane a1 = new Ane("Tétu", 3);

        p1.affiche();
        v1.affiche();
        a1.affiche();
    } 
}