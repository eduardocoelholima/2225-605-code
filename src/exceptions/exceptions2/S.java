package classes.exceptions;// What is the exceution order?

public class S {
  static int exceptionCounter = 5;

  static {
	System.out.println("exceptionCounter = " + exceptionCounter );
  }
  public static void main(String[] args) {
  }
}
