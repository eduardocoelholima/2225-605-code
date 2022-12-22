package exceptions.exceptions2;

/*
 * Execution: java -ea:
 */
public class Assertion_2 {
	public void method( int value ) {
		assert 0 <= value: "Value must be postive =" + value + "=";
		System.out.println("asertM ---->");
		System.out.println("\tvalue = " + value );
		System.out.println("asertM <----");
	}

	public static void printAssertion( AssertionError ae ) {
		StackTraceElement[] stackTraceElements = ae.getStackTrace();
		StackTraceElement stackTraceElement = stackTraceElements[ 0 ];

		System.err.println( "AssertionError" );
		System.err.println( "   class=   " + stackTraceElement.getClassName() );
		System.err.println( "   method=  " + stackTraceElement.getMethodName() );
		System.err.println( "   message= " + ae.getMessage() );
	}
                    
	public static void main( String[] args ) {
		Assertion_2 asertM = new Assertion_2();
		try {
			asertM.method( 1 );
			asertM.method( -1 );
		} catch( AssertionError ae )	{
			printAssertion(ae);
		}
	}
}
