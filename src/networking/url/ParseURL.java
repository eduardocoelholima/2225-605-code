package url;

import java.net.URL;

/**
 * An example of querying a URL object.
 *
 * $ java ParseURL
 * protocol = http
 * authority = example.com:80
 * host = example.com
 * port = 80
 * path = /docs/books/tutorial/index.html
 * query = name=networking
 * filename = /docs/books/tutorial/index.html?name=networking
 * ref = DOWNLOADING
 */
public class ParseURL {
    public static void main(String[] args) throws Exception {

        URL aURL = new URL("http://example.com:80/docs/books/tutorial"
                + "/index.html?name=networking#DOWNLOADING");

        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
    }
}