package gui.layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Demonstrates a border pane of labels.
 *
 * @author RIT CS
 */
public class BorderPaneDemo extends Application {
    /** window width */
    private final static int WIDTH = 200;
    /** window height */
    private final static int HEIGHT = 300;

    @Override
    public void start(Stage stage) throws Exception {
        // create the empty border pane
        BorderPane borderPane = new BorderPane();

        // add the top label to the borderpane
        Label top = new Label("TOP");
        borderPane.setTop(top);
        BorderPane.setAlignment(top, Pos.CENTER);

        // add the bottom label to the borderpane
        Label bottom = new Label("BOTTOM");
        borderPane.setBottom(bottom);
        BorderPane.setAlignment(bottom, Pos.CENTER);

        // add the left label to the borderpane
        Label left = new Label("LEFT");
        borderPane.setLeft(left);
        BorderPane.setAlignment(left, Pos.CENTER);

        // add the right label to the borderpane
        Label right = new Label("RIGHT");
        borderPane.setRight(right);
        BorderPane.setAlignment(right, Pos.CENTER);

        // add the center label to the borderpane
        Label center = new Label("CENTER");
        borderPane.setCenter(center);
        BorderPane.setAlignment(center, Pos.CENTER);

        // add the border pane to the scene and display it
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("BorderPaneDemo");
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);
        stage.show();
    }
}
