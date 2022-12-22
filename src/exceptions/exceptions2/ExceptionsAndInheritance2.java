package exceptions.exceptions2;// What is the execution order?

public class ExceptionsAndInheritance2 extends
	ExceptionsAndInheritance1 {

  public void importantFunction() {
	System.out.println("ExceptionsAndInheritance2:importantFunction -->");
  }

  public static void main(String[] args) {
	ExceptionsAndInheritance2 e2 = new ExceptionsAndInheritance2();
	ExceptionsAndInheritance1 e1Cast = (ExceptionsAndInheritance2)e2;
	ExceptionsAndInheritance1 e1 = new ExceptionsAndInheritance1();

	System.out.println("-----------------------------");
	e2.importantFunction();
	System.out.println("-----------------------------");
	// e1Cast.importantFunction(); // will this line compile?
	try {
		e1Cast.importantFunction();
	} catch (Exception e)	{
		System.out.println("Main ");
		e.printStackTrace();
	}
	System.out.println("-----------------------------");
	try {
		e1.importantFunction();
	} catch (Exception e)	{
		System.out.println("Main ");
		e.printStackTrace();
	}
	System.out.println("-----------------------------");
  }
}
