package patterns2;// read: https://docs.oracle.com/javase/tutorial/essential/regex/quant.html
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternQuestions {

    public static void main(String[] args) {
// Find a text to match the pattern
	String patternDefinition;
	String text;

	text		  = "aa";
	patternDefinition = "a+b*";
	System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

	patternDefinition = "x[a-z]+b";
	System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

	patternDefinition = "^a[a-z][b-z]i";
	System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

	patternDefinition = "\\s\\S\\w";
	System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

	patternDefinition = "a*b*c*.";
	System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

	patternDefinition = "[0-9]{3}t[0-9]{2}";
	System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

	patternDefinition = "[0-9]{3}\\.[0-9]{2}";
	System.out.println(text + " is matched by " + patternDefinition +  ": " + Pattern.matches(patternDefinition, text) );

    }
}
