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

class String_1 {

  public static void main( String args[] ) {
	String aString = "David";
	String bString = "David Bowie";

	if ( "hello".equals("hello") )
		System.out.println("equal");
	if ( "David" == aString )
		System.out.println("David == aString ");
	System.out.println(aString.length());
	System.out.println(aString.charAt(0));

	System.out.println(aString.indexOf("vid"));

	System.out.println(aString.substring(2,3));
	System.out.println(aString.substring(
			         aString.indexOf("a"),
			         aString.indexOf("i")
 			  		    ));

	System.out.println(aString.concat(" Bowie").length());

	String help = bString.substring(0, aString.length());
	System.out.println("-->" + help + "<--" );
	if ( "David" == help )
		System.out.println("David == help ");
	if ( "David" == aString )
		System.out.println("David == bString ");
  }
}
