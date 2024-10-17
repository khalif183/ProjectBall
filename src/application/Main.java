package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Create a label to display the text
            Label label = new Label("Hello, JavaFX!");

            // Create a layout pane
            StackPane root = new StackPane();
            root.getChildren().add(label);

            // Create a scene with the layout pane
            Scene scene = new Scene(root, 400, 400);

            // Set the title and scene for the primary stage
            primaryStage.setTitle("JavaFX Example");
            primaryStage.setScene(scene);

            // Show the primary stage
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
