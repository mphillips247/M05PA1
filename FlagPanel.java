//Chapter 14 Exercise 14.1
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class FlagPanel extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create a pane to hold the image views
        GridPane pane = new GridPane();

        //place nodes in the pane
        pane.add(new ImageView(new Image("uk.gif")), 0, 0);
        pane.add(new ImageView(new Image("ca.gif")), 1, 0);
        pane.add(new ImageView(new Image("china.gif")), 0, 1);
        pane.add(new ImageView(new Image("us.gif")), 1, 1);

        //create a scene and place it in the stage
        Scene scene = new Scene(pane);
		//set the stage title
        primaryStage.setTitle("Flag Panel"); 
        //place the scene in the stage
		primaryStage.setScene(scene);
        // display the stage
		primaryStage.show(); 
    }

 
}
