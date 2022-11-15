package tests;

class Verif  {

    static public boolean isBisextile(int annee) {
        if (annee % 400 == 0) {
            return true;
        } else if (annee % 100 == 0) {
            return false;
        } else if (annee % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static public void testBoolean( Boolean a, Boolean b) {
        if (a!= null && b != null)
            System.out.println( String.format( "%s : %b == %b", a == b ? "OK" : "KO",  a, b));
        else if (a == null && b != null)
            System.out.println( String.format( "KO : null == %b", b));
        else if  (b == null && a != null)
            System.out.println(String.format( "KO : %b == null", a));
        else
            System.out.println("OK : null == null");
    }

    static public void testBisextile(int an, Boolean r) {
        System.out.print(an);
        Verif.testBoolean( isBisextile(an), r);
    }
}

public class bissextileTest {
    public static void main(String args[]) {
        Verif.testBisextile( 1900, false );
        Verif.testBisextile( 2068, true );
        Verif.testBisextile( 2488, true );                                                                    
        Verif.testBisextile( 2600, false );
        Verif.testBisextile( 1983, false );
        Verif.testBisextile( 1982, false );
        Verif.testBisextile( 1981, false );
        Verif.testBisextile( 2020, true );
    }
}
