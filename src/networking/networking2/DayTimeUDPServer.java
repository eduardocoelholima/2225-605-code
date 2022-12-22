package networking.networking2;

import java.net.*;
import java.io.*;
import java.util.*;

public class DayTimeUDPServer extends Thread {

    DatagramSocket 	socket;
    static String 	hostName = "localhost";
    int			port     = 1313;


    public DayTimeUDPServer()	{
    }

    public DayTimeUDPServer(int port)	{
        try {
            socket = new DatagramSocket(port);
            System.out.println ("Listening on port: "
                    + socket.getLocalPort());
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    private void printMessage()	{
        System.out.println("-h		---->	help");
        System.out.println("[-host 		hostName");
        System.out.println(" -port 		port");
        System.out.println(" {-port 		port}");
        System.out.println("or ");
        System.out.println(" no argument");
    }

    /**
     * Parse the commandlind arguments and sets variables.
     */
    public void parseArgs(String args[]) {

        for (int i = 0; i < args.length; i ++) {
            if (args[i].equals("-h"))
                printMessage();
            else if (args[i].equals("-host"))
                hostName = args[++i];
            else if (args[i].equals("-port")) {
                port = new Integer(args[++i]).intValue();
                new DayTimeUDPServer(port).start();
            }
        }
    }

    public void run()	{
        byte[] buf = new byte[256];
        try {
            for(;;) {
                String sendThis = "it is now: " + new Date();
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                buf = sendThis.getBytes();
                packet = new DatagramPacket(buf, buf.length, address, port);
                System.out.println("Sending to port: " + port );
                System.out.println("Sending    data: " + new String(buf) );
                socket.send(packet);
            }
        } catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String argv[]) {
        if ( argv.length == 0 )
            new DayTimeUDPServer(0).start();
        else
            new DayTimeUDPServer().parseArgs(argv);
    }
}
