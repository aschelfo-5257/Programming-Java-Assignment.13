import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

public class FileInput extends Application {

    private static final String IMAGE_PATH = "playingcarddecks/images/iconmonstr-home-6-48.png";
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 300;
    private static final int IMAGE_WIDTH = 100;

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

    public static void main(String[] args) {
        launch(args);
    }
}

/**
 * Displays a local image using JavaFX.
 * Ensure JavaFX libraries are included in your project's build path.
 */
