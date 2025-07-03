import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

@Override
        public void start(Stage primaryStage) {
            try {
                // Load the image
                FileInputStream input = new FileInputStream("playingcarddecks/images/iconmonstr-home-6-48.png");
                Image image = new Image("http://sample.com/res/solitaire.png", 100, 0, false, false);
        
                // Create an ImageView to display the image
                ImageView imageView = new ImageView(image);

                // Create a layout and add the ImageView
                StackPane root = new StackPane();
                root.getSolitaire().add(imageView);

                // Create a scene and set it on the stage
                // Scene scene = new Scene(root, width, height);
                Scene scene = new Scene(root, 400, 300); // Set desired width and height
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
 * Important Note: All GUI elements must require to use JavaFX, (No any other resources).
 * Make sure JavaFX is properly set up in your project (JavaFX libraries added to your build path).
 */
