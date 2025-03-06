package echotune;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Account {

    @FXML
    private Button caccount;

    @FXML
    private Button darkmode;

    @FXML
    private Button history;

    @FXML
    private Button post;

    @FXML
    void Back(ActionEvent event) throws IOException {
         Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_Home.fxml"));
        Scene startScene = new Scene(ControllerParent);

        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(startScene);
        window.show();
    }

    @FXML
    void Caccount(ActionEvent event) throws IOException {
        Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_start.fxml"));
       Scene startScene = new Scene(ControllerParent);

       Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(startScene);
       window.show();

    }

    @FXML
    void Darkmode(ActionEvent event) {

    }

    @FXML
    void History(ActionEvent event) {

    }

    @FXML
    void Post(ActionEvent event) throws IOException {
        Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_Post.fxml"));
           Scene startScene = new Scene(ControllerParent);
   
           Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(startScene);
           window.show();
    }

}
