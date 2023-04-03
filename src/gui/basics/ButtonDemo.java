package gui.basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * Demonstrates a single button that does nothing when pressed.
 *
 * @author RIT CS
 */
public class ButtonDemo extends Application {
    private final static int WIDTH = 200;

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("DO NOT CLICK HERE");
        Scene scene = new Scene(button);
        stage.setScene(scene);
        stage.setTitle("Window title comes here");
        stage.setWidth(WIDTH);
        stage.setResizable(true);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
