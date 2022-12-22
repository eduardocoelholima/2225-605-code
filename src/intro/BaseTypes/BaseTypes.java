package intro.BaseTypes;

public class BaseTypes {
  public static void main(String[] args) {
      boolean flag = true; // boolean: Boolean value is true or false
      char ch = 'A';       // char: 16-bit Unicode character
      byte b = 12;         // byte: 8-bit signed integer
      short s = 24;        // short: 16-bit signed integer
      int i = 257;         // int: 32-bit signed integer
      long l = 890L;       // long: 64-bit signed integer
                           // note use of "L" to denote a 'long' constant
      float f = 3.1415F;   // float: a 32-bit floating-point number
                           // "F" suffix required to denote 'float' constant
      double d = 2.1828;   // double: a 64-bit floating-point number

      // In the following, '+' is string concatenation.
      // Values of base types are implicitly converted to strings.
      System.out.println("flag = " + flag);
      System.out.println("ch = " + ch);
      System.out.println("s = " + s);
      System.out.println("i = " + i);
      System.out.println("l = " + l);
      System.out.println("f = " + f);
      System.out.println("d = " + d);
  }

}
