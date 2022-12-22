package classes.vehicle;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * This class is the main simulation engine that is responsible for
 * reading the input file and conducting the race.
 *
 * @author sps
 */
public class CannonballRun {

    /**
     * The road the race will be run on.
     */
    private Road road;

    /**
     * The time between simulation events in minutes
     */
    private final int INTERVAL = 10;

    /**
     * Read the input file and construct the road and vehicles for the race.
     *
     * @param filename The name of the input file.
     * @throws FileNotFoundException If the file can't be found.
     */
    public CannonballRun(String filename) throws FileNotFoundException {
        System.out.println("*** Reading input file " + filename + "...\n");

        // open the file for scanning
        File file = new File(filename);
        Scanner in = new Scanner(file);

        // loop over and parse each line in the input file
        while (in.hasNextLine()) {
            // read and split the line into an array of strings
            // where each string is separated by spaces.
            String line = in.nextLine();
            String[] fields = line.split(" ");

            // If first string in line is "Road", construct the road:
            //         Road road_name length
            if (fields[0].equals("Road")) {
                road = new Road(fields[1], Integer.parseInt(fields[2]));
                System.out.println(road);
                // If first string in line is "Vehicle" construct a vehicle:
                //        Vehicle vehicle_name mpg tank_capacity max_speed
            } else if (fields[0].equals("Vehicle")) {
                Vehicle1 vehicle = new Vehicle1(
                                            fields[1],
                                            Integer.parseInt(fields[2]),
                                            Double.parseDouble(fields[3]),
                                            Integer.parseInt(fields[4]));
                road.addVehicle(vehicle);
                System.out.println(vehicle);
            }
        }
    }

    /**
     * The main simulation loop runs here.  For each interval all
     * vehicles on the road are allowed to travel until one
     * car passes the finish line (end of the road).
     */
    public void run() {
        int minutes = 0;    // keep track of total minutes elapsed

        System.out.println("\n*** The race is starting!");

        boolean weHaveAWinner = false;
        while (!weHaveAWinner) {
            minutes += INTERVAL;
            int leadLocation = Integer.MIN_VALUE;
            String leader = null; // at each interval we'll track the lead car

            System.out.println(
                    "\n*** Simulating " + INTERVAL + " minutes...\n");
            for (Vehicle1 vehicle : road.getVehicles()) {

                // for this interval tell each vehicle to travel on the road
                vehicle.travel(INTERVAL, road);

                // find the vehicle that is in the lead based on its location
                // on the road
                if (vehicle.getLocation() > leadLocation) {
                    leader = vehicle.getName();
                    leadLocation = vehicle.getLocation();
                }
            }

            for (Vehicle1 vehicle : road.getVehicles()) {

                // the winner of the race is the first to reach the end of
                // the road
                if (vehicle.getLocation() >= road.getLength()) {
                    System.out.println("\n*** " + vehicle.getName() +
                            " just won the Cannonball Run in " + minutes +
                    " minutes!");
                    weHaveAWinner = true;
                }
            }

            if ( !weHaveAWinner ) {
                System.out.println( "\n\t*** " + leader
                        + " is in the lead at the " + leadLocation
                        + " mile mark!" );
            }
        }
    }

    /**
     * The main method takes the name of the file with the race information.
     *
     * @param args Command line arguments -- first and only is input file.
     * @throws FileNotFoundException if the file cannot be opened
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java CannonballRun filename");
        } else {
            // read the input file (can throw an exception)
            CannonballRun race = new CannonballRun(args[0]);

            // simulation main loop will only run if there is no error
            // reading the input file
            race.run();
        }
    }
}
