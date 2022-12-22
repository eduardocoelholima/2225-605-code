package inheritance.fruit.v2;

// most docstrings have been omitted for instructional brevity
// a partial example of testing equals and hashCode
public class ValidateEquals {

    public static void main( String[] args ) {
        System.out.println( "ValidateEquals. A 'false' result is an error." );
        FruitA apple1 = new Apple2( 1, 1, "Any" );
        FruitA apple1e = new Apple2( 1, 1, "Any" );
        int tstNum = 1;
        System.out.println( tstNum++ + ": " + apple1.equals( apple1e ) );
        System.out.println( tstNum++ + ": " + apple1e.equals( apple1 ) );
        System.out.println( tstNum++ + ": " + ( apple1.hashCode() == apple1e.hashCode() ) );
        FruitA apple2 = new Apple2( 3, 1, "Any" );
        System.out.println( tstNum++ + ": " + (! apple1.equals( apple2 ) ) );
        System.out.println( tstNum++ + ": " + (! apple1e.equals( apple2 ) ) );
        System.out.println( tstNum++ + ": " + ( apple1.hashCode() != apple2.hashCode() ) );
        FruitA banana1 = new Banana2( 1, 1, "Any", true );
        FruitA banana2 = new Banana2( 1, 1, "Any", false );
        System.out.println( tstNum++ + ": " + (! apple1.equals( banana1 ) ) );
        System.out.println( tstNum++ + ": " + (! banana1.equals( banana2 ) ) );
    }
}