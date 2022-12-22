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

public class Try {

  private void f(int n) throws Exception {
	System.out.println("f(" + n + ")" );
	switch (n)	{
		case 1:  throw new NullPointerException("1");
		default: throw new Exception("default");
	}
  }

  public static void main(String[] args) {
	int countExceptions = 0;
	for (int index = 0; index < 3; index ++ )	{
		try {
			new Try().f(index);
		} catch (Exception e)	{
			e.printStackTrace();
		}
		
		finally  {
			countExceptions ++;
		}
	}
	System.out.println("Caught " + countExceptions +
			    " exceptions.");
  }
}
