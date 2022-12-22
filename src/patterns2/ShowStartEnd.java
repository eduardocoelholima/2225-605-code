package classes.patterns;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ShowStartEnd {

	public static String replace(String aString, int position) {
		String tmp = aString.substring(0, position) + "|" + aString.substring(position+1, aString.length() );
		return tmp;
	}

	public static void main(String[] args) {
		String patternDefinition = "\\bxy\\b";
		String text		   = "xy xy xyz xy xy";
		Pattern pattern = Pattern.compile(patternDefinition);
		Matcher aMatcher = pattern.matcher(text);
		boolean matched = aMatcher.matches();

		System.out.println(text + " => " + replace(text, 1 ) );

		while ( aMatcher.find() )	{
			String showPos =  replace(text,  aMatcher.start());

			System.out.println(text + " is matched by " + patternDefinition +  ": " + showPos + ": " +
					aMatcher.start() + " - " + aMatcher.end() );
		}
	}
}
