package classes.basics;

class Break {

    public static void main( String args[] ) {

        int n = 0;

        here: {
            while ( true )  {
                System.out.println("a: outer while here n == " + n);

                if ( n > 4 )
                    System.exit(1);

                while ( true )  {
                    System.out.println("	inner while here n == " + n);
                    if ( ++n == 0 )
                        System.out.println("n == 0");
                    else if ( n++ == 1 )    {
                        System.out.println("	n == 1");
                        System.out.println("	break");
                        break;
                    } else if ( n++ == 2 )
                        System.out.println("	n == 2");
                    else
                        System.out.println("	n == 3");

                    System.out.println("	executing break here");
                    System.out.println("	n is " + n );

                    break here;

                }
                System.out.println("b: outer while here n == " + n);
            }
            // unreachable statement ...System.out.println("here }");
        }
    }
}
