package echotune;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Crearecont {

    @FXML
    private Button cancelusername;

    @FXML
    private TextField email;

    @FXML
    private Button next_button;

    @FXML
    private TextField password;

    @FXML
    private Text userexista;

    @FXML
    private TextField username;

    @FXML
    void Cancelusername(ActionEvent event) throws IOException {
        Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_start.fxml"));
        Scene startScene = new Scene(ControllerParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(startScene);
        window.show();
    }

    @FXML
    void Savename(ActionEvent event) throws IOException {
       
    }
    

    @FXML
    void onNextButtonPressed(ActionEvent event) throws IOException {
    	String sql_username = "root";
    	String sql_password = "Hetero7145";
    	String connectionURI = "jdbc:mysql://localhost:3306/echotune";
    	
    
    	ResultSet resultSet = null;
    	
    	String queryemail= "SELECT EXISTS FROM user(Email)";
    			
    			if(queryemail.equals(email.getText())) {
    				
    				String queryname = "SELECT EXISTS FROM user(Nume_User)";
    				if(queryname.equals(username.getText())) {
    					
    					String insert = "INSERT INTO user (Email, Nume_User, Parola) "
    							+ "VALUES (" + "'" + email.getText() + "', '" + username.getText() + "', '" + password.getText() + "');";
    					try {
    			    		Class.forName("com.mysql.cj.jdbc.Driver");
    			    		Connection connection = DriverManager.getConnection(connectionURI, sql_username, sql_password);
    			    		PreparedStatement prepsInsertProduct = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
    			   		
    			    		prepsInsertProduct.execute();
    			    	} catch (Exception e) {
    			    		e.printStackTrace();
    			    	}
    			    	 Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_MusicPick.fxml"));
    			         Scene startScene = new Scene(ControllerParent);
    			         Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    			         window.setScene(startScene);
    			         window.show();
    				}else {
        				userexista.setText("The Username is already taken");
        			}
    			}else {
    				userexista.setText("The email is already taken");
    			}


    	
    }

}
