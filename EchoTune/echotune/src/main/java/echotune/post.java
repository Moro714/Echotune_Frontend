package echotune;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class post {


    @FXML
    private Button savesong;
    
    

    @FXML
    void Cancelsong(ActionEvent event) throws IOException {
         Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_Account.fxml"));
        Scene startScene = new Scene(ControllerParent);

        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(startScene);
        window.show();
    }

    @FXML
    void Savesong(ActionEvent event) throws IOException {
        Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_Home.fxml"));
       Scene startScene = new Scene(ControllerParent);

       Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(startScene);
       window.show();
   }
   @FXML
   void Select_a_Cookey(ActionEvent event) {

   }
   @FXML
   void Select_a_Mp3(ActionEvent event) {
	   FileChooser fileChooser = new FileChooser();

       // Set extension filter
       FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
       FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
       fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

       // Show open file dialog
       File file = fileChooser.showOpenDialog(null);
   }


    @FXML
    private ImageView myImageView;

    @FXML
    void Select_a_Post(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        // Set extension filter
        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

        // Show open file dialog
        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            Image image = new Image(file.toURI().toString());
            myImageView.setImage(image);
        }
    }
}

