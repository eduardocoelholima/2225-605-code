package networking2;

import java.io.*;
import java.net.*;

class HpEchoSocketTest {

    Socket aSocket;
    String hostName = "localhost";
    int port;
    PrintWriter outPutStream = null;
    BufferedReader inPutStream = null;

    public HpEchoSocketTest()	{
    }
    public HpEchoSocketTest(String name, int port) {
        hostName = name;
        this.port = port;
    }

    public void parseArgs(String args[]) {

        for (int i = 0; i < args.length; i ++) {
            if (args[i].equals("-host"))
                hostName = args[++i];
            else if (args[i].equals("-port"))
                port = new Integer(args[++i]).intValue();
        }
    }

    public void createIOconnections() throws Exception {
        try {
            aSocket = new Socket(hostName, port);
            outPutStream = new PrintWriter( aSocket.getOutputStream(), true);
            inPutStream = new BufferedReader( new InputStreamReader( aSocket.getInputStream()));
        } catch (Exception e )       {
            System.out.println(e.toString());
            System.exit(1);
        }
    }
    public void closeIOconnections() throws Exception {
        try {
            inPutStream.close();
            outPutStream.close();
        } catch (Exception e )       {
            System.out.println(e.toString());
            System.exit(1);
        }
    }
    public void readAndPrint() throws Exception {
        InputStream ins;
        OutputStream os;

        BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in));
        String userInput;

        while ((userInput = stdIn.readLine()) != null) {
            outPutStream.println(userInput);
            System.out.println("echo: " + inPutStream.readLine());
        }
        stdIn.close();
    }

    public void doTheJob()       {
        try {
            System.out.println("host: " +  hostName );
            System.out.println("port: " +  port );
            HpEchoSocketTest aHpEchoSocketTest = new HpEchoSocketTest(hostName, port);
            createIOconnections();
            readAndPrint();
            closeIOconnections();
        } catch (Exception e) {
            System.out.println (e);
        }
    }

    public static void main(String[] args) {
        HpEchoSocketTest st;
        String host = "spiegel.cs.rit.edu";
        int    port = 12345;
        HpEchoSocketTest aHpEchoSocketTest = new HpEchoSocketTest();
        aHpEchoSocketTest.parseArgs(args);
        aHpEchoSocketTest.doTheJob();
    }

}
