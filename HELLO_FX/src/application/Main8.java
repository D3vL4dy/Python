package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Popup;
import javafx.stage.Stage;


public class Main8 extends Application {
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn0;
	TextField tf;
	String res = "";
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("Main8.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			btn1 = (Button) scene.lookup("#btn1");
			btn2 = (Button) scene.lookup("#btn2");
			btn3 = (Button) scene.lookup("#btn3");
			btn4 = (Button) scene.lookup("#btn4");
			btn5 = (Button) scene.lookup("#btn5");
			btn6 = (Button) scene.lookup("#btn6");
			btn7 = (Button) scene.lookup("#btn7");
			btn8 = (Button) scene.lookup("#btn8");
			btn9 = (Button) scene.lookup("#btn9");
			btn0 = (Button) scene.lookup("#btn0");
			Button btn_call = (Button) scene.lookup("#btn_call");
			tf = (TextField) scene.lookup("#tf");
			
			btn_call.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
			        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main8_popup.fxml"));
			        Parent root1;
			        Stage stage;
			        try {
			        	root1 = (Parent) fxmlLoader.load();
			        	stage = new Stage();
			        	stage.setScene(new Scene(root1));
			        	stage.show();
			        }catch(Exception e) {
			        	e.printStackTrace();
			        }
					
				}
			});
			
			
			btn1.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn1.getText();
					tf.setText(res);
				}
			});
			
			btn2.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn2.getText();
					tf.setText(res);
				}
			});
			
			btn3.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn3.getText();
					tf.setText(res);
				}
			});
			
			btn4.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn4.getText();
					tf.setText(res);
				}
			});
			
			btn5.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn5.getText();
					tf.setText(res);
				}
			});
			
			btn6.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn6.getText();
					tf.setText(res);
				}
			});
			
			btn7.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn7.getText();
					tf.setText(res);
				}
			});
			
			btn8.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn8.getText();
					tf.setText(res);
				}
			});
			
			btn9.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn9.getText();
					tf.setText(res);
				}
			});
			
			btn0.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					res += btn0.getText();
					tf.setText(res);
				}
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}

