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

public class Excep_1 {

  private int convert(String s)	{
	int result = 0;

	try {
		result = Integer.parseInt(s);
	} catch ( NumberFormatException e ) {
		System.out.println("Haeh? " + e );
		e.printStackTrace();
	}
	return result;
  }

  public static void main(String[] args) {
	new Excep_1().convert("42");
	new Excep_1().convert("opa");
  }
}
