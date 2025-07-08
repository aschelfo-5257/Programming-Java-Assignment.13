import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class NodeStyle extends Application { // Extend Application
    /**
     * A JavaFX application that displays a specified local image in a window.
     * <p>
     * The image is loaded from a relative path. Ensure that the image exists
     * at the specified location before running the application.
     * </p>
     * <p>
     * Dependencies: JavaFX libraries must be included in the project's build path.
     * </p>
     */
    /** Relative path to the image file to display. */
    @Override
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue;"); // Set button border color

        pane.getChildren().add(btOK);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Node Style Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * Loads an image from a given relative file path and returns it as an ImageView.
     *
     * @param relativePath The relative path to the image file.
     * @param width        The desired width of the loaded image (height is scaled to preserve aspect ratio).
     * @return An ImageView containing the loaded image, or {@code null} if the image could not be loaded.
     */

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
