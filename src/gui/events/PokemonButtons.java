package gui.events;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Demonstrates a 2x2 grid of custom buttons with images that update a
 * label when pressed.
 *
 * @author RIT CS
 */
public class PokemonButtons extends Application {
    /** number of columns */
    private final static int COLS = 2;
    /** number of rows */
    private final static int ROWS = 2;

    /** the four types of pokemon we have */
    private enum Pokemon {
        BULBASAUR,
        CHARMANDER,
        PIKACHU,
        SNORLAX
    }

    /** bulbasaur image */
    private Image bulbasaur = new Image(getClass().getResourceAsStream(
        "bulbasaur.png"));
    /** charmander image */
    private Image charmander = new Image(getClass().getResourceAsStream(
        "charmander.png"));
    /** pikachu image */
    private Image pikachu = new Image(getClass().getResourceAsStream(
        "pikachu.png"));
    /** snorlax image */
    private Image snorlax = new Image(getClass().getResourceAsStream(
        "snorlax.png"));

    /** a definition of white for the button background */
    private static final Background WHITE =
            new Background( new BackgroundFill(Color.WHITE, null, null));

    /** the label with the name of the last pokemon selected */
    private Label label;

    /** the font size of the label */
    private final static int LABEL_FONT_SIZE = 40;


    /**
     * A helper function that builds a grid of buttons to return.
     *
     * @return the grid pane
     */
    private GridPane makeGridPane(){
        GridPane gridPane = new GridPane();

        Pokemon pokemon[] = Pokemon.values();
        int i = 0;
        for (int row=0; row<ROWS; ++row) {
            for (int col=0; col<COLS; ++col) {
                // get the next type of pokemon and create a button for it
                PokemonButton button = new PokemonButton(pokemon[i++]);

                // change the label to the pokemon type when pressed
                button.setOnAction(event -> 
                    this.label.setText(button.getType().toString()));

                // JavaFX uses (x, y) pixel coordinates instead of
                // (row, col), so must invert when adding
                gridPane.add(button, col, row);
            }
        }

        return gridPane;
    }

    private class PokemonButton extends Button {
        /** the type of this pokemon */
        private Pokemon pokemon;

        /**
         * Create the button with the image based on the pokemon.
         *
         * @param pokemon the pokemon
         */
        public PokemonButton(Pokemon pokemon) {
            this.pokemon = pokemon;
            Image image;
            switch (pokemon) {
                case BULBASAUR:
                    image = bulbasaur;
                    break;
                case CHARMANDER:
                    image = charmander;
                    break;
                case PIKACHU:
                    image = pikachu;
                    break;
                case SNORLAX:
                default:
                    image = snorlax;
            }

            // set the graphic on the button and make the background white
            this.setGraphic(new ImageView(image));
            this.setBackground(WHITE);
        }

        /**
         * Get the pokemon type.
         *
         * @return this pokemon's type
         */
        public Pokemon getType() {
            return this.pokemon;
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the border pane that holds the grid and label
        BorderPane borderPane = new BorderPane();

        // create the label that the buttons will update when pressed
        this.label = new Label("UNKNOWN");
        this.label.setStyle("-fx-font: " + LABEL_FONT_SIZE + " arial;");
        borderPane.setTop(this.label);
        BorderPane.setAlignment(this.label, Pos.CENTER);

        // get the grid pane from the helper method
        GridPane gridPane = makeGridPane();
        borderPane.setCenter(gridPane);

        // store the grid into the scene and display it
        Scene scene = new Scene(borderPane);
        stage.setTitle("PokemonButtons");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
