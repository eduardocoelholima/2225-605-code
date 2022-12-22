package interfaces.shape;

import java.util.ArrayList;

/**
 * A test program for shapes that shows
 */
public class TestShapes {

    /**
     * The main method.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Square square1 = new Square(5);
        System.out.println("square1 side length: " + square1.getSide());      // only works with Square's
        System.out.println("square1 area: " + square1.getArea());
        System.out.println("square2 perimeter: " + square1.getPerimeter());
        System.out.println();

        Circle circle1 = new Circle(8.3);
        System.out.println("circle1 radius: " + circle1.getRadius());         // only works with Circle's
        System.out.println("circle1 area: " + circle1.getArea());
        System.out.println("circle1 perimeter: " + circle1.getPerimeter());
        System.out.println();

        Triangle triangle1 = new Triangle(24, 34, 18);
        System.out.println("triangle1 aSide: " + triangle1.getASide());       // only works with Triangle's
        System.out.println("triangle1 bSide: " + triangle1.getBSide());       // only works with Triangle's
        System.out.println("triangle1 cSide: " + triangle1.getCSide());       // only works with Triangle's
        System.out.println("triangle1 area: " + triangle1.getArea());
        System.out.println("triangle1 perimeter: " + triangle1.getPerimeter());
        System.out.println();



        // create a collection to hold the various shapes and add them all
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square1);
        shapes.add(circle1);
        shapes.add(triangle1);

        // polymorphically access each shape and display the area and perimeter
        for (Shape shape : shapes) {
            System.out.println("shape: " + shape);      // call Shape's toString
            System.out.println("shape's area: " + shape.getArea());
            System.out.println("shape's perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
