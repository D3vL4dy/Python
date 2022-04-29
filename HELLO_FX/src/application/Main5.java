package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Main5 extends Application {
	TextField tf_dan;
	TextArea ta;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("Main5.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Button btn = (Button) scene.lookup("#btn");
			tf_dan = (TextField) scene.lookup("#tf_dan");
			ta = (TextArea) scene.lookup("#ta");
			
			btn.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick();
				}
			});

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void myclick() {
		String a = tf_dan.getText();
		int dan = Integer.parseInt(a);
		String result = "";
		
		for(int i = 1; i <= 9; i++) {
			result += dan + "*" + i + "=" + dan*i + "\n"; 
		}
		ta.setText(result);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

