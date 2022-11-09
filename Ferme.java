import java.util.ArrayList;
class LaFerme {
    ArrayList<Animal> animaux = new ArrayList<>();
    public void ajoutAnimal(Animal animal) {
        animaux.add(animal);
    }
    public void aTable() {
        for (Animal animal : animaux) {
            animal.manger();
        }
    }
    public Animal appeler (String nom) {
        for (Animal animal : animaux) {
            if (animal.nom.equals(nom))
                return animal;
        }
        return null;
    }
}
class Animal {
    String nom;
    public Animal (String nom) {
        this. nom = nom;
    }
    public void manger() {}
}
class Mammifere extends Animal {
    public Mammifere(String nom) {
        super(nom);
    }

    public void manger() {
        System.out.println(String.format("Je m'appelle %s, je suis un mammifère et je mange de l'herbe.", this.nom));
    }
} 
class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }
    public void manger() {
        System.out.println(String.format("Je m'appelle %s, je suis un oiseau et je mange des insectes.", this.nom));
    }
}

class Canard extends Oiseau {
    int nbrAile;
    public Canard(String nom, int aile) {
        super(nom);
        this.nbrAile = aile;
    }
    public void manger() {
        System.out.println(String.format("Je m'appelle %s, je suis un canard, j'ai %s ailes et je mange de l'herbe.", this.nom, this.nbrAile));
    }
}
class Vache extends Mammifere {
    int nbrPatte;
    public Vache(String nom, int patte) {
        super(nom);
        this.nbrPatte = patte;
    }
    public void manger() {
        System.out.println(String.format("Je m'appelle %s, je suis une vache, j'ai %s pattes et je mange de l'herbe.", this.nom, this.nbrPatte));
    }
} 

public class Ferme {
    public static void main(String[] args) {

        LaFerme f1 = new LaFerme();

        f1.ajoutAnimal(new Vache("Pimprenelle", 4));
        f1.ajoutAnimal(new Mammifere("Coco"));

        f1.ajoutAnimal(new Oiseau("Titi"));
        f1.ajoutAnimal(new Canard("Donald",2));

        f1.aTable();
    } 
}