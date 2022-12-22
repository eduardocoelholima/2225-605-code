package classes.basics;

public class X_s1 {

    public static void method_c()        {
        String right = new String(10 * 1 - 10 + "");
        String middle  = "00".substring(0, 1);
        String zero  = "0";
        String left  = "1";
        String leftLeft  = "2";
        int    aInt  = 3;

        System.out.println("c_0: " +     ( "0" == zero )   );
        System.out.println("c_1: " +     ( "0" == left )   );
        System.out.println("c_2: " +     ( "0" == middle   ) );
        System.out.println("c_3: " +     (  aInt + aInt ) );
        System.out.println("c_4: " +     (  left + aInt + aInt ));
        System.out.println("c_5: " +     ( ( left  =  left + aInt + aInt ) ) + left );
        // c_3: 6
        // c_4: 133
        // c_5: 133133
        System.out.println("c_6: " +     ( ( leftLeft = left = ( left  =  left + aInt + aInt ) ) ) + left );
        System.out.println("c_7: " +     ( leftLeft ) );
        System.out.println("c_7: " +     ( ( "1" + ""  ) == "1" ) );
        // c_6: 1333313333
        // c_7: 13333
        // c_7: true
        System.out.println("c_8: " +     ( ( aInt  + "1" ) == ( left + "1" ) ) );
        // c_8: false
        System.out.println( 1 + "1" );
        System.out.println( ( 1 + 1 ) + "1" );
        // 11
        // 21

    }
    public static void main(String argv[]) {
        method_c();
    }
}