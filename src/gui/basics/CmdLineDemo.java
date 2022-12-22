package gui.basics;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.List;

/**
 *
 * This shows how you can process the command line arguments in init().
 *
 * $ java CommandLineDemo
 * Command line args:
 * first
 * second and third
 * fourth
 * fifth
 *
 * @author RIT CS
 */
public class CmdLineDemo extends Application {
    @Override
    public void init() {
        // get the command line args
       List<String> args = getParameters().getRaw();

       System.out.println("Command line args:");
       for (String arg : args) {
           System.out.println(arg);
       }
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
