package networking2;

import java.net.*;
import java.io.*;
import java.util.*;
// java EchoServer -port 12345
public class EchoServer extends Thread {

    ServerSocket 	aServerSocket;
    int			port     = 4242;

    public EchoServer()	{
    }

    public EchoServer(int port)	{
        try {
            aServerSocket = new ServerSocket(port);
            System.out.println ("Listening on port: " + aServerSocket.getLocalPort());
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    private void printMessage()	{
        System.out.println("-h		---->	help");
        System.out.println(" -port 		port");
        System.out.println(" {-port 		port}");
        System.out.println("or ");
        System.out.println(" no argument");
    }

    /**
     * Parse the commandlind arguments and sets variables.
     */
    private  void parseArgs(String args[]) {

        for (int i = 0; i < args.length; i ++) {
            if (args[i].equals("-h"))
                printMessage();
            else if (args[i].equals("-port")) {
                port = new Integer(args[++i]).intValue();
                new EchoServer(port).start();
            }
        }
    }

    public void run()	{
        try {
            for(;;) {
                Socket clientSocket = aServerSocket.accept();
                System.out.println(clientSocket.toString());
                PrintWriter out = new PrintWriter (clientSocket.getOutputStream (), true);
                BufferedReader in = new BufferedReader( new InputStreamReader( clientSocket.getInputStream()));
                while ( true )	{
                    String input = in.readLine();
                    if ( input == null ) System.exit(0);
                    System.out.println("sending back: " + input );
                    out.println("back: " + input );
                }
                // clientSocket.close();
            }
        } catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String argv[]) {
        if ( argv.length == 0 )
            new EchoServer(12345).start();
        else
            new EchoServer().parseArgs(argv);
    }
}
