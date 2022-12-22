package classes.basics;

/**
  * Play with the String class
  *
  * @version    $Id$
  *
  * @author     Hpb
  *
  *     $Log$
  */

class StringUse {

  public static void compare(String aString, String bString)	{
	if ( aString.equals(bString) )
		System.out.println("\tequal");
	else
		System.out.println("\t! equal");
	if ( aString == bString)
		System.out.println("\t== ");
	else
		System.out.println("\t! ==");

  }
  public static void main( String args[] ) {
	String aString = "David";
	String bString = "David";
	compare(aString, bString);

	System.out.println("Using New");
	aString = new String("David");
	bString = new String("David");
	compare(aString, bString);

	System.out.println("Concatenation 1");
	aString = "Da" + "vid";
	bString = "" + "David";
	compare(aString, bString);
	
	System.out.println("Concatenation 2");
	aString = "Da" + "vid";
	bString = "D" + "a" + "vid";
	compare(aString, bString);
	
  }
}
