import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 

public class maillogin extends Application { 
   @Override 
   public void start(Stage stage) {      
      Text text = new Text("Email address");       
      
      Text text1 = new Text("Password"); 
	  
      TextField textField1 = new TextField();       
      
      TextField textField2 = new TextField();  
       
      Button btn1 = new Button("Submit"); 
      Button btn2 = new Button("Clear");  
      
      GridPane gridPane = new GridPane();    
      
      gridPane.setMinSize(400, 200); 
       
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      gridPane.setAlignment(Pos.CENTER); 
       
      gridPane.add(text, 0, 0); 
      gridPane.add(textField1, 1, 0); 
      gridPane.add(text1, 0, 1);       
      gridPane.add(textField2, 1, 1); 
      gridPane.add(btn1, 0, 2); 
      gridPane.add(btn2, 1, 2);  
      
      Scene scene = new Scene(gridPane);  
      
      stage.setTitle("Mail Login:"); 
         
      stage.setScene(scene); 
         
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
} 