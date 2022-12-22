package exceptions.exceptions2;

public class Test_2a	{
/*
TRY
CATCH
nested catch
CATCH after 1/0
FINALLY
new Test_2().tryCatchFinally(); = 3
*/
/*
http://download.oracle.com/javase/tutorial/essential/exceptions/finally.html
*/
	public int tryCatchFinally() {
	        try {
	            System.out.println("TRY");
	            int i = 1/0;
	            System.out.println("TRY after 1/0");
	            return 1;
	        } catch (Exception e) {
	            System.out.println("CATCH");
		    try { 
			    int i = 1/0;
		   
	            } catch (Exception ee) {
			    System.out.println("nested catch");
		    }
	            System.out.println("CATCH after 1/0");
	            return 2;
	        } finally {
	            System.out.println("FINALLY");
	            return 3;	// same question
	        }
	}
	
	
	public static void main(String[] args )	{
		// is the return value 2?
		System.out.println("new Test_2().tryCatchFinally(); = " + 
				new Test_2a().tryCatchFinally() );
	}
}
