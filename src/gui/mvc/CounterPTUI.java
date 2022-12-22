package gui.mvc;

import java.util.Scanner;

/**
 * A simple plain-text user interface (PTUI) to control a counter.
 * This class is both the view and controller,
 * according to the MVC architectural style.
 *
 * @author James Heliotis
 */
public class CounterPTUI implements Observer< Counter > {
    /** the model */
    private Counter model;

    /**
     * Initialize the model and the view here.
     */
    public CounterPTUI() {
        this.model = new Counter();
        initializeView();
        System.out.println( "value: " + model.getCount() );
    }

/*
 ******************* THE CONTROLLER SECTION *********************************
 */

    /**
     * The main loop reads input from the user and informs the model
     * of any changes.  '-' to decrement, '+' to increments, and
     * '.' to exit.
     */
    private void run() {
        try ( Scanner userIn = new Scanner( System.in ) ) {
            System.out.print( "cmd> " ); System.out.flush();
            mainLoop:
            while ( userIn.hasNextLine() ) {
                String userCmd = userIn.nextLine();
                switch ( userCmd ) {
                    case "-":
                        this.model.decrement();
                        break;
                    case "+":
                        this.model.increment();
                        break;
                    case ".": // an escape clause for IntelliJ
                        break mainLoop;
                    default:
                        error("Illegal command.", false);
                        // Direct controller -> view connection
                }
                System.out.print( "cmd> " ); System.out.flush();
            }
        }
    }

/*
 ******************* THE VIEW SECTION ***************************************
 */

    /**
     * Add the view as an observer of the model.
     */
    private void initializeView() {
        model.addObserver(this);
    }

    @Override
    public void update( Counter model ) {
        System.out.println( "value: " + model.getCount() );
    }

    /**
     * The user enter bad input.
     *
     * @param message error message
     * @param critical if critical the GUI exits
     */
    private void error( String message, boolean critical ) {
        System.err.println( message );
        if ( critical ) System.exit( 1 ); // NEVER do this with a GUI!
    }

    /**
     * The main method runs the plain text UI.
     *
     * @param args
     */
    public static void main( String[] args ) {
        CounterPTUI ui = new CounterPTUI();
        ui.run();
    }
}
