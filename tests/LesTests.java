package tests;

class Atester  {
    static public Integer calcul1( int var ) {
        return 5 * var;
    }

    static public String presentation( String n )
    {  
        if (n.equals("")){
            return n;
        }
        return n.toUpperCase().charAt(0) +n.toLowerCase().substring(1);
    }



} 


public class LesTests {
    public static void main( String[] args ) {
       if ( Atester.calcul1( 3 ) == 15 )
            System.out.println( "OK" );

        if ( Atester.calcul1( 0 ) == 0 )
            System.out.println( "OK" );

        if ( Atester.calcul1( 1 ) == 5 );

        /* ******************************* */

        if ( Atester.presentation( "toto" ).equals( "Toto"))
            System.out.println( "test toto : OK");
        else
            System.out.println( "test toto : KO" );
        if ( Atester.presentation( "TOTO" ).equals( "Toto"))
            System.out.println( "test TOTO : OK" );
        else
            System.out.println( "test TOTO : KO" );
 
        if ( Atester.presentation( "" ).equals( ""))
            System.out.println( "test empty : OK" );
        else
            System.out.println( "test empty : KO" );

        if ( Atester.presentation( "émile" ).equals( "Émile"))
            System.out.println( "test émile : OK" );
        else
            System.out.println( "test émile : KO" );
    }     
}
