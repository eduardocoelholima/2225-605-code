package gui.basics;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This program demonstrates the order the methods are run in when inheriting
 * from JavaFX's Application class.
 *
 * $ java FirstGUI
 * main()
 * FirstGUI()
 * init()
 * start()
 * stop()
 *
 * @author RIT CS
 */
public class FirstGUI extends Application {
    public FirstGUI() {
        // do any non-JavaFX initialization here
        System.out.println("FirstGUI()");
    }

    @Override
    public void init() {
        // process command line args here and do pre GUI setup
        System.out.println("init()");
    }

    @Override
    public void start(Stage stage) throws Exception {
        // initialize all JavaFX components here and show the stage
        System.out.println("start()");
        stage.show();
    }

    @Override
    public void stop() {
        // called when the GUI is shutdown
        System.out.println("stop()");
    }

    public static void main(String[] args) {
        // handle bad command line args here
        System.out.println("main()");
        Application.launch(args);
    }
}
