package abstract_classes.abstract_classes2;

public class  Car extends Vehicle1 {
	 int speed = 0;
	 public void setSpeed(int speed){
		this.speed = speed;
	 }
	 public String toString(){
		return "speed = "  + speed;
	 }
	 static public void changeStateOf(Car thisCar )	{
		thisCar.setSpeed(42);
	 }
	 public static void main(String args[] )	{
	        Car aCar = new Car();
		System.out.println("1:	" + aCar);
		changeStateOf(aCar);
		System.out.println("2:	" + aCar);
	 }
}
