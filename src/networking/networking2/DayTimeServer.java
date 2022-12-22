package networking2;

import java.net.*;
import java.io.*;
import java.util.*;
// java DayTimeServer -port 12345
public class DayTimeServer extends Thread {

    ServerSocket 	aServerSocket;
    int			port     = 4242;

    public DayTimeServer()	{
    }

    public DayTimeServer(int port)	{
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
                port = Integer.parseInt(args[++i]);
                new DayTimeServer(port).go();
            }
        }
    }

    public void go()	{
        try {
            for(;;) {
                Socket connectionToClientSocket = aServerSocket.accept();
                System.out.println(connectionToClientSocket.toString());
                PrintWriter out = new PrintWriter
                        (connectionToClientSocket.getOutputStream (), true);
                out.println("It is now: " + new Date());
                connectionToClientSocket.close();
            }
        } catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String argv[]) {
        if ( argv.length == 0 )
            new DayTimeServer(0).start();
        else
            new DayTimeServer().parseArgs(argv);
    }
}
