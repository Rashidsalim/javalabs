import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class moviegenre extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		

		Text text = new Text("Genre:");

		Text text1 = new Text("Name:");

		Text text2 = new Text("Registered:");

		TextField textfield1 = new TextField();
		textfield1.setPrefWidth(150);

		ComboBox genrecomboBox = new ComboBox();
        
		genrecomboBox.setPrefWidth(150);

		ComboBox comboBox = new ComboBox();
		comboBox.setPrefWidth(150);

		Button button1 = new Button("Save Movie");
		Button button2 = new Button("Delete Movie");

		GridPane gridpane = new GridPane();
		
		gridpane.setMinSize(600, 400);

		gridpane.setPadding(new Insets(10, 10, 10, 10));

		gridpane.setVgap(10);
		gridpane.setHgap(10);

		gridpane.setAlignment(Pos.CENTER);

		gridpane.add(text, 0, 0);
		gridpane.add(genrecomboBox, 1, 0);

		gridpane.add(text1, 0, 1);
		gridpane.add(textfield1, 1, 1);
		gridpane.add(button1, 1, 2);

		gridpane.add(text2, 0, 3);
		gridpane.add(comboBox, 1, 3);
		gridpane.add(button2, 1, 4);
		
		button1.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");
		button2.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");

		Scene scene = new Scene(gridpane);

		stage.setTitle("Movie Store");

		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}