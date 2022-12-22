package classes.exceptions;

public class A {

  private void f(int n) throws Exception {
	System.out.println("f(" + n + ")" );
	switch (n)	{
		case 1:  throw new NullPointerException("1");
			 // break;	unreachable
		default: throw new Exception("default");
	}
  }

  public static void main(String[] args) {
	try {
		new A().f(1);
	} catch (Exception e)	{
		e.printStackTrace();
	}
  }
}
