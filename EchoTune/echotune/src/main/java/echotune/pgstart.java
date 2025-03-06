package echotune;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class pgstart implements Initializable {
    
    @FXML
    public BorderPane Startscene;
    @FXML
    public Button back;
    @FXML
    public Button dumbass;
    @FXML
    public Button login;
    @FXML
    public Button register;
    @FXML
    public Button settings;
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private Button login_button;
      
    public void Back(ActionEvent event) {

    }
    public void Dumbass(ActionEvent event) {
        
    }
    ///Schimbi Scena
    public void  login_user_action(ActionEvent event) throws IOException {
//        Connection connection =null;
        if( email.getText() != "" && password.getText() != ""){
        Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_Home.fxml"));
        Scene startScene = new Scene(ControllerParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(startScene);
        window.show();
        return;
        }       
    }
        
    public void Register(ActionEvent event) throws IOException {
            Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_CreareCont.fxml"));
            Scene startScene = new Scene(ControllerParent);
            Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(startScene);
            window.show();
    }
    
    
    
    
    
    
    
    public void Settings(ActionEvent event) throws IOException {   
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getClassLoader().getResource("pg_Startsettings.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
    }
    @Override
    public void initialize(URL location,ResourceBundle resources){
        //  Connection connection = DatabaseConnection.getConnection();
    //     if (connection != null) {
    //         String query = "SELECT * FROM mytable";
    //         try {
    //             Statement statement = connection.createStatement();
    //             ResultSet resultSet = statement.executeQuery(query);

    //             while (resultSet.next()) {
    //                 int id = resultSet.getInt("id");
    //                 String name = resultSet.getString("name");
    //                 // Retrieve other columns as needed

    //                 System.out.println("ID: " + id + ", Name: " + name);
    //             }
    //         } catch (SQLException e) {
    //             System.out.println("Query failed: " + e.getMessage());
    //         } finally {
    //             try {
    //                 connection.close();
    //             } catch (SQLException e) {
    //                 System.out.println("Failed to close connection: " + e.getMessage());
    //             }
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     executeQuery();
    // }
    }
}
