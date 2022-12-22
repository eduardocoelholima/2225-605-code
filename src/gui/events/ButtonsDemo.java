package gui.events;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Demonstrates a functional GUI where the buttons when pushed change
 * a label.
 *
 * @author RIT CS
 */
public class ButtonsDemo extends Application {
    private final static int WIDTH = 200;

    @Override
    public void start(Stage stage) throws Exception {
        // create the border pane
        BorderPane borderPane = new BorderPane();

        // create a label whose text will change when a button is pushed
        Label label = new Label();
        label.setText("Last pressed: None");
        borderPane.setBottom(label);
        BorderPane.setAlignment(label, Pos.CENTER);

        // create the buttons and add them to the border pane
        HBox hbox = new HBox();
        Button first = new Button("First");
        Button second = new Button("Second");
        hbox.getChildren().addAll(first, second);
        hbox.setAlignment(Pos.CENTER);
        borderPane.setCenter(hbox);

        // when the first button is pushed, change the label to indicate it
        first.setOnAction((event) -> {
           label.setText("Last pressed: First");
        });

        // when the second button is pushed, change the label to indicate it
        second.setOnAction((event) -> {
            label.setText("Last pressed: Second");
        });

        // store the border pane into the scene and display it
        Scene scene = new Scene(borderPane);
        stage.setTitle("ButtonsDemo");
        stage.setScene(scene);
        stage.setWidth(WIDTH);
        stage.setResizable(false);
        stage.show();
    }
}
