package url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownServiceException;

public class Reverse {
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.err.println("Usage:  java Reverse "
                    + "http://<location of your servlet/script>"
                    + " string_to_reverse");
            System.exit(1);
        }

        String stringToReverse = URLEncoder.encode(args[1], "UTF-8");

        URL url = new URL(args[0]);
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try
                (OutputStreamWriter out = new OutputStreamWriter(
                connection.getOutputStream())) {
            out.write("string=" + stringToReverse);
            out.flush();  // force the buffered output to write out to the stream

            try
                    (BufferedReader in = new BufferedReader(
                            new InputStreamReader(
                                    connection.getInputStream()))) {
                String decodedString;
                while ((decodedString = in.readLine()) != null) {
                    System.out.println(decodedString);
                }
            } catch (IOException ioe) {
                System.err.println(ioe.getMessage());
            }
        } catch (UnknownServiceException use) {
            System.err.println(use.getMessage());
        }

    }
}
