package generics.generics2;

public class Cube extends Square {

	double length;

	Cube(double length)	{
		this.length = length;
	}
	Cube() {}
	public double area()	{
		return 6 * length * length;
	} 
	public double volume()	{
		return length * length * length;
	} 
}
