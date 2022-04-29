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
		String b1 = btn1.getText();
		tf.setText(b1);
		String b2 = btn2.getText();
		tf.setText(b2);
		String b3 = btn3.getText();
		tf.setText(b3);
		String b4 = btn4.getText();
		tf.setText(b4);
		String b5 = btn5.getText();
		tf.setText(b5);
		String b6 = btn6.getText();
		tf.setText(b6);
		String b7 = btn7.getText();
		tf.setText(b7);
		String b8 = btn8.getText();
		tf.setText(b8);
		String b9 = btn9.getText();
		tf.setText(b9);
//		String b0 = btn0.getText();
//		tf.setText(b0);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

