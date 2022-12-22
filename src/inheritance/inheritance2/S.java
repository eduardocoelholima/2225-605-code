package inheritance.inheritance2;//package classes.inheritance;

public class S {

  static public int intS;		

  public S ()	{
	System.out.println("in S constructor");
  }

  static {
	System.out.println("S:Static 1");
  }

  static {
	System.out.println("S: Static 2");
  }

  public static void main(String args[])	{
	System.out.println("new S()     " +  new S());
  }
}
