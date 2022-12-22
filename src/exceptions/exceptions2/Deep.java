package exceptions.exceptions2;// What is the exceution order?

public class Deep {
  static int exceptionCounter = 0;
  static final int  MAX = 2;

  private void importantFunction(int n) throws NullPointerException,
                               InterruptedException {
	System.out.println("importantFunction -->");
	switch (n)	{
		case 1:  throw new NullPointerException("1");
		default: throw new InterruptedException("default");
	}
  }


  private void smartFunction() throws Exception {
	try {
		importantFunction(exceptionCounter);
		importantFunction(exceptionCounter);
	} catch (NullPointerException e)	{
		e.printStackTrace();
		throw new Exception("Programming error, Please call 555 1234 321");
	} catch (InterruptedException e)	{
		e.printStackTrace();
		throw new Exception("User Error error, Please call your brain");
	}
	finally {
		if ( ++exceptionCounter >= MAX )	{
			System.err.println("Something is wrong");
			System.err.println("BYE");
			System.exit(1);////// never do this
		}
	}
  }

  public static void main(String[] args) {
	try {
		Deep aDeep = new Deep();
		System.out.println("----> ");
		aDeep.smartFunction();
		System.out.println("====> ");
		aDeep.smartFunction();
	} catch (Exception e)	{
		System.out.println("Main ");
		e.printStackTrace();
	}
  }
}
