package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Main4 extends Application {
	TextField tfMine;
	TextField tfCom;
	TextField tfResult;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("Main4.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			tfMine = (TextField)scene.lookup("#tfMine");
			tfCom = (TextField)scene.lookup("#tfCom");
			tfResult = (TextField)scene.lookup("#tfResult");
			Button btn = (Button)scene.lookup("#btn");
			
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
		int rnd = (int) (Math.random() * 2);
		if(rnd == 0) {
			tfCom.setText("홀");
		}else {
			tfCom.setText("짝");
		}
		
		String mine = tfMine.getText();
		String com = tfCom.getText();
		if(mine.equals(com)) 
			tfResult.setText("정답");
		else
			tfResult.setText("오답");
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

