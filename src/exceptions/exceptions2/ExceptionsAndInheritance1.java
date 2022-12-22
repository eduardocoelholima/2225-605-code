package exceptions.exceptions2;// What is the exceution order?

public class ExceptionsAndInheritance1 {

  public void importantFunction() throws InterruptedException {
	System.out.println("ExceptionsAndInheritance1:importantFunction -->");
	throw new InterruptedException("ExceptionsAndInheritance1.java");
  }

  public static void main(String[] args) {
	try {
		new ExceptionsAndInheritance1().importantFunction();
	} catch (Exception e)	{
		System.out.println("Main ");
		e.printStackTrace();
	}
  }
}
