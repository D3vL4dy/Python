package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Main6 extends Application {
	Label lbl1;
	Label lbl2;
	Label lbl3;
	Label lbl4;
	Label lbl5;
	Label lbl6;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("Main6.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			lbl1 = (Label) scene.lookup("#lbl1");
			lbl2 = (Label) scene.lookup("#lbl2");
			lbl3 = (Label) scene.lookup("#lbl3");
			lbl4 = (Label) scene.lookup("#lbl4");
			lbl5 = (Label) scene.lookup("#lbl5");
			lbl6 = (Label) scene.lookup("#lbl6");
			Button btn = (Button) scene.lookup("#btn");
			
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
			int[] arr45 = new int [45];
			for(int i = 0; i < arr45.length; i++) {
				arr45[i] = i+1;
			}
			
			for(int i = 0; i < 1000; i++) {
				int rnd = (int)(Math.random() * 45);
				int a = arr45[rnd];
				int b = arr45[0];
				arr45[0] = a;
				arr45[rnd] = b;
			}
			
			lbl1.setText(arr45[0] + "");
			lbl2.setText(arr45[1] + "");
			lbl3.setText(arr45[2] + "");
			lbl4.setText(arr45[3] + "");
			lbl5.setText(arr45[4] + "");
			lbl6.setText(arr45[5] + "");
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}

