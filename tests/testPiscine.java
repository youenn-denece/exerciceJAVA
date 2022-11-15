/* package tests;

class Atester {
    
    static public void testDoubleEq(Double a, Double b) {
        if (a!= null && b != null)
            System.out.println( String.format("%s : %f == %f", a.equals(b)? "OK" : "KO", a, b));
        else if (a == null && b != null)
            System.out.println( String.format("KO : null == %f", b));
        else if (b == null && a != null)
            System.out.println( String.format("KO : %f == null", a));
        else
            System.out.println("OK : null == null");
    }

    static public Double tarif(int age) {
        if (age <  5)
            return 0.0;
        else if (age <  12)
            return 4.0;
        else if (age <60)
            return 5.5;
        else 
            return 4.5;
    }
}
public class testPiscine {
    public static void main( String[] args ) {
        Atester.testDoubleEq( Atester.tarif( 11 ) , 4.0 );
        Atester.testDoubleEq( Atester.tarif( 12 ) , 5.5 );
        Atester.testDoubleEq( Atester.tarif( 59 ) , 5.5 );
        Atester.testDoubleEq( Atester.tarif( 60 ) , 4.5 );
        Atester.testDoubleEq( Atester.tarif( 61 ) , 4.5 );
        Atester.testDoubleEq( Atester.tarif( 4 ) , 0.0 );
        Atester.testDoubleEq( Atester.tarif( 5 ) , 4.0 );
        Atester.testDoubleEq( Atester.tarif( 6 ) , 4.0 );
    }
    
}
 */