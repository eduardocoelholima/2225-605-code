package exceptions;

import java.util.Calendar;
import java.util.Date;

class IllegalYearException extends Exception {
    private int year;

    public IllegalYearException( int year ) {
        super( "Future Year" );
        this.year = year;
    }

    public int getYear() { return this.year; }
}

class Vehicle {
    private int year;
    private String make;

    public Vehicle( String make, int year ) throws IllegalYearException {
        if ( year > getCurrentYear() + 1 ) {
            throw new IllegalYearException( year );
        }
        // note no 'else' required!
        this.year = year;
        this.make = make;
    }

    private int getCurrentYear() {
        Date date = new Date(); // right now
        Calendar cal = Calendar.getInstance();
        cal.setTime( date );
        return cal.get( Calendar.YEAR );
    }

    @Override
    public String toString() {
        return this.year + " " + this.make;
        // Cool riddle: change double quotes to single!!?!
    }
}


public class TrafficSim {
    public static void main( String[] args ) {
        try {
            Vehicle v = new Vehicle( "Toyota", 2018 );
            System.out.println( "We made a " + v );
        }
        catch( IllegalYearException iye ) {
            System.err.println( iye.getMessage() );
            System.err.println( "Year given was " + iye.getYear() + '.' );
        }
    }
}
