package exceptions.exceptions2;

public class Y	{

/*
http://download.oracle.com/javase/tutorial/essential/exceptions/finally.html
*/
	public int tryCatchFinally() {
	     try {
	        try {
	            System.out.println("TRY");
	            int i = 1/0;
	            System.out.println("TRY after 1/0");
	            return 1;
	        } catch (Exception e) {
	            System.out.println("CATCH");
	            return 2;
	        } finally {
	            System.out.println("FINALLY");
		    return 3;	// what will happen if we comment this line out?
	        }
	      } catch (Exception e) {
	            System.out.println("Y");
		    return 4;
	        } finally {
	            System.out.println("XXX FINALLY");
		    return 5;	// what will happen if we comment this line out?
	        }
	}
	
	
	public static void main(String[] args )	{
		// return value is?
		System.out.println("new Y().tryCatchFinally(); = " + 
				new Y().tryCatchFinally() );
	}
}
