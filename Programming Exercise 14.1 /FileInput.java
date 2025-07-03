import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FileInput extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Load the image (from resources or file system)
        Image image = new Image("file:example.jpg"); // Use "file:" for local files

/**
 * Important Note: All GUI elements must require to use JavaFX, (No any other resources).
 */
