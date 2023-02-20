package generics.generics2;

import java.util.LinkedList;
import java.util.List;
public class UpperBoundExample<T extends Cube> {

    T theThing;

    public UpperBoundExample(T theThing)  {
	this.theThing = theThing;
    }
    public static void main(String[] args)	{
	    // UpperBoundExample<Square> aSquare = new UpperBoundExample<Square>(new Square());
	    UpperBoundExample<Cube>   aCube   = new UpperBoundExample<Cube>(new Cube());
	    UpperBoundExample<Brick>  aBrick  = new UpperBoundExample<Brick>(new Brick());
						// linked list op UpperBoundExample->Brick
	    List<UpperBoundExample<Brick>> aList = new LinkedList<>();
						// linked list op UpperBoundExample->Square
	    List<UpperBoundExample<Cube>> bList = new LinkedList<UpperBoundExample<Cube>>();
	    List<UpperBoundExample<? extends Cube>> cList = new LinkedList<UpperBoundExample<? extends Cube>>();    
	    aList.add( new UpperBoundExample<Brick>(new Brick() ) );
	    bList.add( new UpperBoundExample<Cube>(new Cube() ) );
	    					// cList.add( new UpperBoundExample<Square>(new Square() ) );
	    cList.add( new UpperBoundExample<Brick>(new Brick() ) );

//	    cList.add( new UpperBoundExample<Square>(new Square() ) );
//UpperBoundExample.java:26: error: incompatible types: UpperBoundExample<Square> cannot be converted to UpperBoundExample<? extends Cube>
//	    cList.add( new UpperBoundExample<Square>(new Square() ) );
//	               ^


    }
}
