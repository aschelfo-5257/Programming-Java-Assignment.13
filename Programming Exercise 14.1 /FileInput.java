import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

public class FileInput extends Application {

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
    private static final String IMAGE_PATH = "playingcarddecks/images/iconmonstr-home-6-48.png";
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 300;
    private static final int IMAGE_WIDTH = 100;

    /**
     * The main entry point for all JavaFX applications.
     *
     * @param primaryStage The primary stage for this application, onto which 
     *                     the application scene can be set.
     */
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        ImageView imageView = loadImageView(IMAGE_PATH, IMAGE_WIDTH);
        if (imageView != null) {
            root.getChildren().add(imageView);
        } else {
            System.out.println("Warning: Image could not be loaded.");
        }

        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setTitle("What You Should Know About Solitaire Card Games");
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
    private ImageView loadImageView(String relativePath, int width) {
        File file = new File(relativePath);
        if (!file.exists()) {
            System.err.println("File not found: " + relativePath);
            return null;
        }

        try {
            String fullPath = "file:" + file.getPath().replace("\\", "/");
            Image image = new Image(fullPath, width, 0, true, true);

            if (image.isError()) {
                System.err.println("Image loading error: " + image.getException());
                return null;
            }

            return new ImageView(image);
        } catch (Exception e) {
            System.err.println("Exception while loading image:");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        launch(args);
    }
}

/**
 * Displays a local image using JavaFX.
 * Ensure JavaFX libraries are included in your project's build path.
 */
