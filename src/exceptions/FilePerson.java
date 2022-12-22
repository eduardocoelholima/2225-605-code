package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FilePerson {

	String name;
	int age;

	public FilePerson(String filename) {
		try {
			Scanner input = new Scanner(new File(filename));
			name = input.next();
			age = input.nextInt();
			input.close();
		} catch (IOException ioe) {
			throw new IllegalArgumentException("Bad filename " + filename);
		} catch (InputMismatchException ime) {
			throw new IllegalArgumentException("Bad file content in " + filename);
		}
	}

}
