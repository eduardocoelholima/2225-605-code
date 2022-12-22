package gui.mvc;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * A simple GUI to control a counter.
 * This class is both the view and controller,
 * according to the MVC architectural pattern.
 *
 * @author James Heliotis
 */
public class CounterGUI extends Application implements Observer< Counter > {
    /** the model */
    private Counter model;
    /** the numerical value to display */
    private TextField valueDisplay;

    @Override
    public void init() {
        // create the model and add ourselves as an observer
        this.model = new Counter();
        model.addObserver( this );
    }

    @Override
    public void start( Stage primaryStage ) throws Exception {
        FlowPane pane = new FlowPane();

        // "Controller"-related components
        //
        Button incrButton = new Button( "+" );
        Button decrButton = new Button( "-" );

        /*
         * In a more complex design with a separate controller,
         * the statements below would inform the controller
         * that a button had been pushed. It would be the
         * controller's job to interpret the event as meaning
         * that the model must do a certain operation.
         */
        incrButton.setOnAction( event -> model.increment() );
        decrButton.setOnAction( event -> model.decrement() );

        // "View" component
        //
        this.valueDisplay =
                new TextField( String.valueOf( this.model.getCount() ) );
        valueDisplay.setEditable( false );


        pane.getChildren().addAll( decrButton, valueDisplay, incrButton );
        primaryStage.setScene( new Scene( pane ) );
        primaryStage.setTitle( "COUNTER" );

        primaryStage.show();
    }

    /**
     * The GUI component, the text field, updates in this method by getting
     * the current value from the model.
     *
     * @param model the model
     */
    private void refresh( Counter model ) {
        valueDisplay.setText( String.valueOf( model.getCount() ) );
    }

    @Override
    public void update( Counter model ) {
        /*
         * Note that just calling setText directly is OK because
         * we know that in this system the update call was triggered
         * by a GUI event. But in the more general case we do not know
         * that, so the more universal approach is shown here for reference.
         */
        if ( Platform.isFxApplicationThread() ) {
            this.refresh( model );
        }
        else {
            Platform.runLater( () -> this.refresh( model ) );
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
