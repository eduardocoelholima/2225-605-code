package gui.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Demonstrates a flow pane and 20 checkboxes inside it.
 *
 * @author RIT CS
 */
public class FlowPaneDemo extends Application {
    private final static int WIDTH = 600;
    private final static int VGAP = 10;
    private final static int HGAP = 20;

    @Override
    public void start(Stage stage) {
        // create an empty flow pane
        FlowPane flowPane = new FlowPane();

        // create 40 check boxes and add them to the flow pane
        for (int i=0; i<40; i++) {
            CheckBox checkBox = new CheckBox(String.valueOf(i));
            flowPane.getChildren().add(checkBox);
        }

        // set the vertical and horizontal gaps between the check boxes
        flowPane.setVgap(VGAP);
        flowPane.setHgap(HGAP);

        // add the flow pane to the scene
        Scene scene = new Scene(flowPane);

        // add the scene to the stage and show it
        stage.setScene(scene);
        stage.setTitle("FlowPaneDemo");
        stage.setWidth(WIDTH);
        stage.show();
    }
}
