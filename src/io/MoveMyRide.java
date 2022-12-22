package io;

import java.io.*;

class Vehicle implements Serializable {

    private String model;
    private double mileage;
    private double fuel;
    private double tanksize;
    public final double MPG = 27.3;

    public Vehicle( String m, double tank ) {
        model = m;
        tanksize = tank;
        fuel = tank;
        mileage = 0;
    }

    public void drive( double miles ) {
        mileage += miles;
        fuel -= miles / MPG;
        if ( fuel < 0 ) {
            fuel = tanksize;
        }
    }

    public String toString() {
        return model + " with " + mileage + " miles on the odometer.";
    }
}

public class MoveMyRide {

    public static void main( String[] args ) {

        if ( args.length != 3 ) {
            System.err.println( "Usage: " +
                "java MoveMyRide [input-file|\"-\"] output-file miles-driven"
            );
            System.exit( 1 );
        }
        try {
            Vehicle v = null;
            if ( args[ 0 ].equals( "-" ) ) { // Bootstrap; create a vehicle.
                v = new Vehicle( "Dart", 20 );
            }
            else {
                ObjectInputStream ois =
                        new ObjectInputStream(
                                new FileInputStream( args[ 0 ] ) );
                v = (Vehicle)( ois.readObject() );
                ois.close();
            }

            System.out.println( v );
            v.drive( Double.valueOf( args[ 2 ] ) );
            System.out.println( v );

            ObjectOutputStream oos =
                    new ObjectOutputStream( new FileOutputStream( args[ 1 ] ) );
            oos.writeObject( v );
            oos.close();
        }
        catch( IOException e ) {
            System.out.println( e );
        }
        catch( ClassNotFoundException c ) {
            System.out.println( c );
        }
    }
}
