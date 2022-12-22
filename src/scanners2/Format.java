// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/PrintStream.html
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/PrintStream.html#printf(java.lang.String,java.lang.Object...)
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Formatter.html#syntax
// %[argument_index$][flags][width]conversion
// format and printf are equivalent to one another
package classes.scanners;

import java.util.Calendar;

class Format {
	public static void main (String args []) {
		double aDouble = 12.3456;
		int aInt = 42;

		String format = "%3d";
		System.out.printf("Integer   : %" + format + "       [" + format + "]\n", aInt); // format behaves exactly as printf

		format = "%6.2f";
		System.out.format("Number    : %" + format + " 	  [" + format + "]\n", aDouble);

		format = "%tT";
		System.out.format("Local time: %" + format + "       [" + format + "]\n", Calendar.getInstance());

		format = "%tc";
		System.out.format("Local time: %" + format + "       [" + format + "]\n", Calendar.getInstance());

		format = "%+13.6f";
		System.out.format("Padding   : %" + format + "   [" + format + "]\n", -1 * aDouble);
	}
}

