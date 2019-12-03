import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class customer extends Application{
	@Override
	public void start(Stage stage) throws Exception{

		//Fields
		Text name = new Text("Name: ");
		TextField namefield = new TextField();

		Text phone = new Text("Phone number: ");
		TextField phonefield = new TextField();

		Text email = new Text("Email address: ");
		TextField emailfield = new TextField();

		Button save = new Button("Save Customer");

		Text registered = new Text("Registered: ");
		ComboBox rcustomer = new ComboBox();

		Button deletecustomer = new Button("Delete Customer: ");

		
		GridPane gridpane = new GridPane();
		
		gridpane.setMinSize(600, 400);

		gridpane.setPadding(new Insets(10, 10, 10, 10));

		gridpane.setVgap(10);
		gridpane.setHgap(10);

		gridpane.setAlignment(Pos.CENTER);

		gridpane.add(name, 0, 0);
		gridpane.add(name_field, 1, 0);

		gridpane.add(phone, 0, 2);
		gridpane.add(phone_field, 1, 2);

		gridpane.add(email, 0, 4);
		gridpane.add(email_field, 1, 4);

		gridpane.add(save, 1, 5);

		gridpane.add(registered, 0, 7);
		gridpane.add(r_customer, 1, 7);

		gridpane.add(remove_customer, 1, 8);	

		Scene scene = new Scene(gridpane);

		stage.setTitle("Movie Library");

		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}