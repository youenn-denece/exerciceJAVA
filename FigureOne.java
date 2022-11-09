class Point {
    
    protected Integer x, y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println(String.format("Point : (%d, %d)", this.x, this.y));
    }

    public void move(int dx, int dy) {
        this.x = dx;
        this.y = dy;
    }
}

class Cercle extends Point {

    int rayon;

    public Cercle(int x, int y, int r) {
        super(x,y);
        this.rayon = r;
    }

    public void affiche() {
        System.out.println(String.format("Cercle : (%d, %d) rayon=%d", this.x, this.y, this.rayon));
    }
}

class Carre extends Point {

    int cote;

    public Carre(int x, int y , int c) {
        super (x,y);
        this.cote = c;
    }

    public void affiche() {
        System.out.println(String.format("Carre : (%d, %d) coté=%d", this.x, this.y, this.cote));
    }
}

class Rectangle extends Point {

    int hauteur; 
    int longueur;

    public Rectangle(int x, int y, int h, int l) {
        super(x,y);
        this.hauteur = h;
        this.longueur = l;
    }

    public void affiche() {
        System.out.println(String.format("Rectangle : (%d, %d) hauteur=%d et longueur=%d", this.x, this.y, this.hauteur, this.longueur));
    }
}


public class FigureOne {
    public static void main(String[] args) {
       
        Point p1 = new Point(5, 6);
        p1.affiche();

        Cercle c1 = new Cercle(11, 61, 45);
        c1.move(20, 41);
        c1.affiche();

       Carre k1 = new Carre(18, -3, 15);
        k1.affiche();

        Rectangle r1 = new Rectangle(3, 19, 99, 18);
        r1.affiche(); 
    }
    
}
