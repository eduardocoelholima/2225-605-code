package exceptions.exceptions2;

/**
 * This class plays with exeptions
 *
 * @version   $Id$
 *
 * @author    hp bischof
 *
 * Revisions:
 *	$Log$
 */

public class X {

  private int convert(String s)	{
	int result = 0;

		result = Integer.parseInt(s);
	return result;
  }

  public static void main(String[] args) {
	new X().convert("42");
	new X().convert("opa");
  }
}
