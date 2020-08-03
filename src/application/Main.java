// Main application class that loads and displays the Calculator's GUI.

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = 
					FXMLLoader.load(getClass().getResource("calculator.fxml"));
			Scene scene = new Scene(root);	// attach scene graph to scene
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	//add css to calculator

			primaryStage.setScene(scene); // attach scene to stage
			primaryStage.show();	// display the stage
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// create a  calculator object and call its start method
		launch(args);
	}
}



