import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class rentals extends Application{
	@Override
	public void start(Stage stage) throws Exception{

		Text customer = new Text("Customer: ");
		ComboBox r_customer = new ComboBox();
		r_customer.setPrefWidth(150);

		Text genre = new Text("Genre: ");
		ComboBox genres = new ComboBox();
		genres.setPrefWidth(150);

		Text movies = new Text("Movies: ");
		ComboBox r_movies = new ComboBox();
		r_movies.setPrefWidth(150);

		Button save_rental = new Button("Save Rental");
		save_rental.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");

		Text borrowed = new Text("Borrowed: ");
		ComboBox m_borrowed = new ComboBox();
		m_borrowed.setPrefWidth(150);

		Button return_movie = new Button("Return Movie");
		return_movie.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");
		
		Text returned = new Text("Returned: ");
		ComboBox m_returned = new ComboBox();
		m_returned.setPrefWidth(150);
	
		GridPane gridpane = new GridPane();
		
		gridpane.setMinSize(600, 400);

		gridpane.setPadding(new Insets(10, 10, 10, 10));

		gridpane.setVgap(10);
		gridpane.setHgap(10);
		gridpane.setStyle("-fx-border-color: #08343a; -fx-border-width: 1px;");

		gridpane.setAlignment(Pos.CENTER);

		gridpane.add(customer, 0, 0);
		gridpane.add(r_customer, 1, 0);

		gridpane.add(genre, 0, 2);
		gridpane.add(genres, 1, 2);

		gridpane.add(movies, 0, 4);
		gridpane.add(r_movies, 1, 4);

		gridpane.add(save_rental, 1, 5);

		gridpane.add(borrowed, 0, 7);
		gridpane.add(m_borrowed, 1, 7);

		gridpane.add(return_movie, 1, 8);

		gridpane.add(returned, 0, 9);
		gridpane.add(m_returned, 1, 9);

		button1.setStyle("-fx-border-color: #00ff00; -fx-border-width: 5px;");
		button2.setStyle("-fx-background-color: darkslateblue");

		Scene scene = new Scene(gridpane);

		stage.setTitle("Movie Library");

		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}