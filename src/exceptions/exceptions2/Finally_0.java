package exceptions.exceptions2;

import java.util.Vector;

public class Finally_0 {

  private void test_1()	 {
	try {
		String aString = "a:";
		aString = null;
		aString.length();
	} catch (NullPointerException e)	{
		System.out.println("NullPointerException caught");
	} finally	{
		System.out.println("finally 1");
	}
  }
  private void test_2()	 {
	try {
		String aString = "a:";
		aString = null;
	} catch (Exception e)	{
		System.out.println(e);
	} finally	{
		System.out.println("finally 2");
	}
  }
  private void test_3()  {
        try {
                String aString = "a:";
                aString = null;
                aString.length();
        } catch (NullPointerException e)        {
                System.out.println("NullPointerException caught");
		System.exit(0);
        } finally       {
                System.out.println("finally 1");
        }
  }
  public static void main(String[] args) {
	new Finally_0().test_1();
	new Finally_0().test_2();
	new Finally_0().test_3();
  }
}
