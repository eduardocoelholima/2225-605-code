package networking2;

import java.net.*;
import java.io.*;
import java.util.*;
public class DayTime {

	String hostName = "spiegel.cs.rit.edu";
	int    port = 13;

	private void printMessage()	{
		System.out.println("-h		---->	help");
		System.out.println("[-host 		hostName]");
		System.out.println("[-port 		port]");
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
			else if (args[i].equals("-port"))
				port = Integer.parseInt(args[++i]);
		}
	}

	public void doTheJob()	{
		try {
			System.out.println("host: " +  hostName );
			System.out.println("port: " +  port );
			Socket aReadSocket = new Socket(hostName, port);

			System.out.println("aReadSocket = " + aReadSocket );
			BufferedReader readFrom = new BufferedReader (
					new InputStreamReader (aReadSocket.getInputStream()));
			String rTime = readFrom.readLine ();
			System.out.println (rTime);
			aReadSocket.close();
		} catch (Exception e) {
			System.out.println (e);
		}
	}

	public static void main(String argv[]) {
		DayTime aDayTime = new DayTime();
		aDayTime.parseArgs(argv);
		aDayTime.doTheJob();

	}
}
