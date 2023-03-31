package previous_exams.exam1_2221;
//1

// what is the output of this program? explain each commented line

public class Strings {
    public static String getString() {
        return "12";
    }

    public static void main( String args[] ) {
        String stringA = "1";
        String stringB = "2";
        int intA = 2;
        int intB = 1;
        String stringC = "1" + "2";
        String stringD = "1" + intA;
        String stringE = intB + "2";
        String stringF = getString();

        System.out.println("" + ( stringA == stringB)  ); //1
        System.out.println("" + ( stringD == "1" + "2")  ); //2
        System.out.println("" + ( stringD == "12" )  ); //3
        System.out.println("" + ( stringC.equals( "" + 10 + 2 ) ) ); //4
        System.out.println("" + ( "1" + "2" == "12" ? "true" : "false" ) ); //5
        System.out.println("" + ( stringD.equals( 1 + "2" ) ) ); //6
        System.out.println( stringC == stringF); //7
        System.out.println("" + ( "1" + "2" == "12")  ); //8

    }
}
