package exceptions.exceptions2;

public class TestAbstract {

  public static void main(String args[])
  {
	Square aSquare;
	Circle aCircle;

	for (int index = 1; index >=  -1; index -= 2 ) {
		try {
			aSquare = new Square(index);
			aCircle = new Circle(index); 
	
			System.out.println( "Circle");
			System.out.println( "\t" +  aCircle.area() );
			System.out.println( "\t" +  aCircle.perimeter() );
	
			System.out.println( "Square");
			System.out.println( "\t" +  aSquare.area() );
			System.out.println( "\t" +  aSquare.perimeter() );
		}
		catch ( Exception e )	{
			System.out.println(e.getMessage() );
		}
	}

  }
}
