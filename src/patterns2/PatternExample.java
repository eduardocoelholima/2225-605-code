package classes.patterns;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternExample {

	public static void main(String[] args) {
		long maxCount = 3;
		String text[] = { "dog", "Fog", "Dog", "xy9ye", "a mug"  };
		String patternDefinition = "dog|[Da]?\\s[um]+g|[^D]og|.*([A-Za-z])[0-9]\\1.*";

		// example with named capturing group
//		String patternDefinition = "dog|[Da]?\\s[um]+g|[^D]og|.*(?<woot>[A-Za-z])[0-9]\\k<woot>.*";
		Pattern pattern = Pattern.compile(patternDefinition);

		// Pattern:
		//	Max one of the set {D, a}, followed by a white space character
		// 	followed by one or more of the set {g, u, m}.
		//	The \\ are required for one escape
		//		matches
		//			a mug
		//  or
		// 	not a D followed by og
		//		matches
		//			Fog, dog, but not Dog
		for ( int index = 0; index < text.length; index ++ )	{
			Matcher aMatcher = pattern.matcher(text[index]);
			System.out.println(text[index] + " is matched by " + patternDefinition +  ": " +
					aMatcher.matches() );
		}
	}
}
