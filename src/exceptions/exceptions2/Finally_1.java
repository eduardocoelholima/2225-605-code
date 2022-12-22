package exceptions.exceptions2;

public class Finally_1 {

  private int test_1()	 {
        try {
                String aString = "a:";
                aString = null;
                aString.length();
        } catch (NullPointerException e)        {
		System.out.println("catch ");
		return 0;
	} finally	{
		System.out.println("finally");
		return 1;
	}
  }
  private int test_2()	 {
        try {
                String aString = "a:";
                aString = null;
                aString.length();
	} catch (Exception e)	{
		throw new Exception("3");
	} finally	{
		System.out.println("finally");
		return 1;
	}
  }
  public static void main(String[] args) {
	System.out.println("Rvalue = " + new Finally_1().test_1());
	System.out.println("Rvalue = " + new Finally_1().test_2());
  }
}
