package generics.generics2;

public class Brick extends Cube {

	double height;
	double width;

	Brick(double length, double height, double width)	{
		super(length);
		this.height = height;
		this.width = width;
	}
	Brick() {}
	public double area()	{
		return 2 * length * width + 2 * width * height + 2 * length * height;
	} 
	public double volume()	{
		return length * width * height;
	} 
}
