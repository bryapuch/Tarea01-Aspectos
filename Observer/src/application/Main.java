package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	Scene s = new Scene(new Ventana().getRoot(),500,500);
    	primaryStage.setTitle("Tarea01-Aspectos");
    	primaryStage.setScene(s);
    	primaryStage.setResizable(false);
    	primaryStage.show();
    	
       
        
        
    }
}