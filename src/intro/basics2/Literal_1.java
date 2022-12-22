package classes.basics;
class Literal_1 {

    public static void main( String args[] ) {
        int three  = 3;
        String aString = "12";
        if ( ("hel" + "lo") == "hello" )
            System.out.println("1");
        if ( ("hel" + "lo").equals("hello") )
            System.out.println("2");
        if ( ( aString + three).equals("123") )
            System.out.println("3");
        if ( ( aString + three) == "123" )
            System.out.println("4");

//        String a = "he";
//        String b = "llo";
//        String c = "hello";
//        System.out.println(a+b == c);
    }
}