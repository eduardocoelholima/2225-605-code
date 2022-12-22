package exceptions.exceptions2;

/**
 * This class plays with exceptions
 *
 * @version   $Id$
 *
 * @author    hp bischof
 *
 * Revisions:
 *	$Log$
 */

public class Excep_2a {

  private void f(int n) throws NullPointerException,
			       InterruptedException {
	System.out.println("f(" + n + ")" );
	switch (n)	{
		case 1:  throw new NullPointerException("1");
			 // break; why is it not required
		default: throw new InterruptedException("default");
	}
  }

  public static void main(String[] args) {
	for (int index = 1; index < 3; index ++ )	{
		try {
			new Excep_2a().f(index);
		} catch (NullPointerException e)	{
			e.printStackTrace();
		}
		
		catch (Exception e)	{
			System.out.println(e.getMessage() );
		}
		
	}
  }
}
