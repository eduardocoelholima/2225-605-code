package classes.generics;

public class Square extends Area {

	double length;

	Square()	{
		
	}
	Square(double length)	{
		this.length = length;
	}
	public double area()	{
		return length * length;
	} 
}
