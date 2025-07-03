import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FileInput extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the image from a local file (ensure the path is correct)
            Image image = new Image("file:playingcarddecks/images/iconmonstr-home-6-48.png", 100, 0, false, false);

            // Display the image
            ImageView imageView = new ImageView(image);

            // Create a layout and add the ImageView
            StackPane root = new StackPane();
            root.getChildren().add(imageView);
            
            /**
             * Create a scene and set it on the stage!
             * Scene scene = new Scene(root, width, height);
             */
            Scene scene = new Scene(root, 400, 300);
            primaryStage.setTitle("What You Should Know About Solitaire Card Games");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/**
 * Displays a local image using JavaFX.
 * Ensure JavaFX libraries are included in your project's build path.
 */
