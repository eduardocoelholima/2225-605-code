package exceptions.exceptions2;

/*
 * Execution: java -ea:
 */
public class Assertion_3 {
	public int method( int i ) {
		
		if (i % 3 == 0) {
			System.out.println("i % 3 == 0");
		} else if (i % 3 == 1) {
			System.out.println("i % 3 == 1");
		} else {
			System.out.println("else");
			assert false : i;
		}
		return 99;
	}
                    
	public static void main( String[] args ) {
		Assertion_3 asertM = new Assertion_3();
		try {
			System.out.println( asertM.method( 3 ));
			System.out.println( asertM.method( 5 ));
		} catch( AssertionError ae )	{
			ae.printStackTrace();
		}
	}
}
