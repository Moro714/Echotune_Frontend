package echotune;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class musicpick {

    @FXML
    private CheckBox Blues;
    	
    @FXML
    private CheckBox Classical;

    @FXML
    private CheckBox Country;

    @FXML
    private CheckBox Electronic;

    @FXML
    private CheckBox House;

    @FXML
    private CheckBox Jazz;

    @FXML
    private CheckBox Lofi;

    @FXML
    private CheckBox Metal;

    @FXML
    private CheckBox Pop;

    @FXML
    private CheckBox Prog;

    @FXML
    private CheckBox Punk;

    @FXML
    private CheckBox Reggae;

    @FXML
    private CheckBox Religious;

    @FXML
    private CheckBox Rock;

    @FXML
    private CheckBox RsiB;

    @FXML
    private CheckBox Techno;

    @FXML
    private Button cancelusername;

    @FXML
    private Button savename;

    @FXML
    void Cancelusername(ActionEvent event) throws IOException {
        Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_CreareCont.fxml"));
        Scene startScene = new Scene(ControllerParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(startScene);
        window.show();
    }

    @FXML
    void Savename(ActionEvent event) throws IOException {
        Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_Home.fxml"));
        Scene startScene = new Scene(ControllerParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(startScene);
        window.show();
    }

}
