package generics.generics2;

import java.util.LinkedList;
import java.util.List;

// inheritance: area ->  square -> cube -> brick
class LowerBound {
    public static void main(String[] args) {
        List<Cube>  listOfCube = new LinkedList<Cube>();
        List<Brick>   listOfBrick  = new LinkedList<Brick>();
        List<Square>   listOfSquare  = new LinkedList<Square>();

        listOfCube.add( new Cube(1) );
        listOfBrick.add( new Brick(1, 2, 3) );
        listOfSquare.add( new Square(1) );

//	    print(listOfBrick);
//LowerBound.java:16: error: incompatible types: List<Brick> cannot be converted to List<? super Cube>
//	print(listOfBrick);
//	                          ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//1 error

        print(listOfCube);
        print(listOfSquare);
    }

    public static void print(List<? super Cube> list) {
        System.out.println(list);
    }
} 
