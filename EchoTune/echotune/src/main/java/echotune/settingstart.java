package echotune;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class settingstart {
    @FXML
    private Button closeButton;
    
    @FXML
    private Button darkmode;

    @FXML
    void Back(ActionEvent event) {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
    }

    @FXML
    void Darkmode(ActionEvent event) {

    }

}
