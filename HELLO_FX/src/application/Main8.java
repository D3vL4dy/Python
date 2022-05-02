package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Main8 extends Application {
	TextField tf;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("Main8.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			tf = (TextField) scene.lookup("#tf");
			
			Button btn1 = (Button) scene.lookup("#btn1");
			btn1.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn2 = (Button) scene.lookup("#btn2");
			btn2.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn3 = (Button) scene.lookup("#btn3");
			btn3.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn4 = (Button) scene.lookup("#btn4");
			btn4.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn5 = (Button) scene.lookup("#btn5");
			btn5.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn6 = (Button) scene.lookup("#btn6");
			btn6.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn7 = (Button) scene.lookup("#btn7");
			btn7.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn8 = (Button) scene.lookup("#btn8");
			btn8.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn9 = (Button) scene.lookup("#btn9");
			btn9.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn0 = (Button) scene.lookup("#btn0");
			btn0.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick(event);
				}
			});
			
			Button btn_call = (Button) scene.lookup("#btn_call");
			btn_call.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					mycall();
				}
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void myclick(Event event){
		Button imsi = (Button) event.getSource();
		String str_new = imsi.getText();
		String str_old = tf.getText();
		tf.setText(str_old + str_new);
	}
	
	public void mycall(){
		String str_tel = tf.getText();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("calling");
		alert.setHeaderText(null);
		alert.setContentText(str_tel);
		alert.showAndWait();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

