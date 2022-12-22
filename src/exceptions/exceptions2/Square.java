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

public class Square extends Area {

  private int length;	

  public Square(int _length) throws Exception {
	if ( _length < 0 )
		throw new Exception("Negative length (" +
				length + ") is not acceptable");
	else
		length = _length;
  }

  public int area() throws Exception {
	if ( length < 0 )
		throw new Exception("Square is not initialized");
	else
		return length * length;
  }

  public int perimeter() throws Exception {
	if ( length < 0 )
		throw new Exception("Square is not initialized");
	else
		return 4 * length;
  }

}
