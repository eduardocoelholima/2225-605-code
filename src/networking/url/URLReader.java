package url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * An example of reading directly from a URL.
 */
public class URLReader {
    public static void main(String[] args) throws Exception {
        URL csapx = new URL("https://www.cs.rit.edu/~csapx/");

        try (
                BufferedReader in = new BufferedReader(
                new InputStreamReader(csapx.openStream())) ) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
