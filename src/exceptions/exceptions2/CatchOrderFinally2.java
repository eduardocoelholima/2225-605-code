package exceptions.exceptions2;

public class CatchOrderFinally2 {

	private void anExeption1()	 {
		int[] anArray  = new int[1];
		String s = "test";
		try {
			anArray[2] = 1;
		} catch (ArrayIndexOutOfBoundsException e)	{
			System.out.println("Caught ArrayIndexOutOfBoundsException in anExeption1()");
			s = null;
			s.length();
		} finally	{
			System.out.println("finally");
		}
	}
	private void anExeption2()	 {
		int[] anArray  = new int[1];
		String s = "test";
		try {
			anArray[2] = 1;
		} catch (ArrayIndexOutOfBoundsException e)	{
			System.out.println("Caught ArrayIndexOutOfBoundsException in anExeption2()");
			s = null;
			s.length();	// this does not end in main with a nullPointerEx.
		} finally	{
			System.out.println("finally");
			anArray[2] = 1;
		}
	}
/*
Caught ArrayIndexOutOfBoundsException in anExeption1()
finally
Caught NullPointerException in main
Caught ArrayIndexOutOfBoundsException in anExeption2()
finally
Caught ArrayIndexOutOfBoundsException in main
*/

	public static void main(String[] args) {
		try {
			new CatchOrderFinally2().anExeption1();
		} catch ( Exception e )	{
			System.out.println("Caught NullPointerException in main");
		}
		try {
			new CatchOrderFinally2().anExeption2();
		} catch ( Exception e )	{
			System.out.println("Caught ArrayIndexOutOfBoundsException in main");
		}
	}
}
