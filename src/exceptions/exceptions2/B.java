package classes.exceptions;

import classes.exceptions.A;

public class B extends A {

  private void f(int n) {
	System.out.println("f(" + n + ")" );
  }

  public static void main(String[] args) {
	new B().f(1);
  }
}
