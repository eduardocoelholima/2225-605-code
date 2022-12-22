package intro.ControlFlow;

/**
 * An example of how the switch statement works.
 *
 * @author James Heliotis (jeh)
 *
 */
public class SwitchDemo {

    /**
     * Give advice to a student based on his/her grade.
     * 
     * @param args a singleton array containing a letter grade
     */
    public static void main( String[] args ) {
        
        char grade = args[ 0 ].charAt( 0  );
        switch ( grade ) {
        case 'A':
        case 'B':
            System.out.println( "Good job." );
            break;
        case 'C':
            System.out.println( "Would you like some study tips?"  );
            break;
        case 'D':
        case 'F':
            System.out.println( "Let's meet." );
            break;
        default:
            System.out.println( "Please speak to your instructor."  );
            System.out.println( "There is a problem with your grade record." );
        }
    }
}
