import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class gui extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		

		Text txt = new Text("Name:");

		Text txt1 = new Text("Registered:");

		TextField textfield1 = new TextField();

		ComboBox comboBox = new ComboBox();

		Button btn1 = new Button("Save");
		Button btn2 = new Button("Delete");

		GridPane gridpane = new GridPane();
		
		gridpane.setMinSize(600, 400);

		gridpane.setPadding(new Insets(10, 10, 10, 10));

		gridpane.setVgap(10);
		gridpane.setHgap(10);

		gridpane.setAlignment(Pos.CENTER);

		gridpane.add(txt, 0, 0);
		gridpane.add(textfield1, 1, 0);
		gridpane.add(btn1, 1, 1);

		gridpane.add(txt1, 0, 2);
		gridpane.add(comboBox, 1, 2);
		gridpane.add(btn2, 1, 3);
		
		button1.setStyle("-fx-border-color: #00ff00; -fx-border-width: 5px; -fx-font-size: 13pt;");
		button2.setStyle("-fx-background-color: darkslateblue");

		Scene scene = new Scene(gridpane);

		stage.setTitle("Movie store");

		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}