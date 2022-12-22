package exceptions.exceptions2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class CompileTime {

  private void openFile (String filenName ) throws FileNotFoundException {
	new Scanner(new File(filenName) );
  }
  private void callOpenFile()	{
	try {
		openFile("thisFileDoesNotExist.txt");
	} catch ( FileNotFoundException e  )	{
		System.out.println("getCasue: " + e.getCause());
		e.printStackTrace();
	}
  }

  public static void main(String[] args) {
	new CompileTime().callOpenFile();
  }
}
