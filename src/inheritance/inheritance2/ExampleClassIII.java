package inheritance.inheritance2;//package classes.inheritance;

public class  ExampleClassIII	{

  String aString = null;

  public void method(String a)	{
	a = new String("set in method");
	System.out.println("2. method:a:" + a ); 
  }
  public void test()	{
	String aString = new String("set in test");

	System.out.println("1. test:aString:" + aString ); 
	method(aString);
	System.out.println("3. test:aString:" + aString ); 
  }
  public static void main(String args[] )	{
	new ExampleClassIII().test();
  }
}
