package exceptions.exceptions2;

/**
 * This class implements a Square class.
 *
 * @version   $Id$
 *
 * @author    hp bischof
 *
 * Revisions:
 *	$Log$
 */

public class SpecialExceptions extends Exception {

  public SpecialExceptions(String _s)	{
	super(_s);
  }

  public int area(int length)	{
	return length * length;
  }

  public int perimeter(int length)	{
	return 4 * length;
  }

}
