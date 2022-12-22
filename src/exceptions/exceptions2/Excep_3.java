package exceptions.exceptions2;

public class Excep_3 {

  private void thisMethodThrowsAnException() throws Exception {
	throw new Exception("in thisMethodThrowsAnException");
	// System.out.println("thisMethodThrowsAnException() ---> " );

        // System.out.println("thisMethodThrowsAnException() <--- " );
        //  ^
	// 1 error
	// System.out.println("thisMethodThrowsAnException() <--- " );
  }

  private int  caller()	{
	try {
		new Excep_3().thisMethodThrowsAnException();
		return 0;
	} catch (Exception e)	{
		e.printStackTrace();
		return 1;
	} finally	{
		System.out.println("Finally");
		System.out.println("Ok, a few things to clean up" );
		return 2;
	}
  }

  public static void main(String[] args) {
	System.out.println(new Excep_3().caller());
  }
}
