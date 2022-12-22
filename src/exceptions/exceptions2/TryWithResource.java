package exceptions.exceptions2;// first line
import java.io.*;
public class TryWithResource {


	static void readAndPrint(String inF ) throws IOException  {

		try (
				BufferedReader in = new BufferedReader( new FileReader(inF) );
		) {
			System.out.println(in.readLine() );
		} catch (Exception e) {
			System.out.println("Could not open file");
			e.printStackTrace();
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
