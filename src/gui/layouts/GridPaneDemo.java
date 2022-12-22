package gui.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Demonstrates a 4x3 grid pane of buttons.
 *
 * @author RIT CS
 */
public class GridPaneDemo extends Application {
    /** number of columns */
    private final static int COLS = 4;
    /** number of rows */
    private final static int ROWS = 3;

    /**
     * A helper function that builds a grid of buttons to return.
     *
     * @return the grid pane
     */
    private GridPane makeGridPane(){
        GridPane gridPane = new GridPane();
        for (int row=0; row<ROWS; ++row) {
            for (int col=0; col<COLS; ++col) {
                Button button = new Button("(" + row + ", " + col + ")");
                // JavaFX uses (x, y) pixel coordinates instead of
                // (row, col), so must invert when adding
                gridPane.add(button, col, row);
            }
        }

        return gridPane;
    }

    @Override
    public void start(Stage stage) throws Exception {
        // get the grid pane from the helper method
        GridPane gridPane = makeGridPane();

        // store the grid into the scene and display it
        Scene scene = new Scene(gridPane);
        stage.setTitle("GridPaneDemo");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
