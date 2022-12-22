package exceptions.exceptions2;// first line
import java.io.*;
public class TryWithOutResourceAndFinally {


static void readAndPrint(String inF ) throws IOException  {
	BufferedReader in = null;

	try 	{
		in = new BufferedReader( new FileReader(inF) );
		System.out.println(in.readLine() );
	} catch (Exception e) {
		System.out.println("Could not open file");
		e.printStackTrace();
 	} finally {
                if ( in != null )
                        in.close();
        }
  }

  public static void main(String args[]) {
	if ( args.length != 1 )	 {
		System.out.println("Usage: java FileIO file");
	} else	{
		System.out.println("Inputfile: " + args[0]);
		try { 
			readAndPrint(args[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  }
}
