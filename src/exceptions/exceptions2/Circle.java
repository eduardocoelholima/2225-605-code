package exceptions.exceptions2;

/**
 * This class implements a Circle class.
 *
 * @version   $Id$
 *
 * @author    hp bischof
 *
 * Revisions:
 *	$Log$
 */

public class Circle extends Area {

  private int radius;	

  public Circle(int _radius) throws Exception {
	if ( radius < 0 )
		throw new Exception("Negativ radius (" +
				radius + ") is not acceptable");
	else
		radius = _radius;
  }

  public int area() throws Exception	{
	if ( radius < 0 )
		throw new Exception("Circle is not initialized");
	else
		return (int)(Math.PI * radius * radius);
  }

  public int perimeter() throws Exception {
	if ( radius < 0 )
		throw new Exception("Circle is not initialized");
	else
		return (int)(Math.PI * radius * radius);
  }

}
