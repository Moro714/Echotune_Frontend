package echotune;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class home {

    @FXML
    private Button Search;

    @FXML
    private Button account;

    @FXML
    private Button energize;

    @FXML
    private Button feelgood;

    @FXML
    private Button homem;

    @FXML
    private Button library;

    @FXML
    private Button party;

    @FXML
    private Button relax;

    @FXML
    private Button romance;

    @FXML
    private Button sad;

    @FXML
    private TextField searchbar;

    @FXML
    private Button workout;
    

    @FXML
    private Button next_browse_button;

    @FXML
    private Button previous_browse_button;
    
    @FXML
    private Button playagain;

    @FXML
    private ImageView playingnowimage;

    @FXML
    private Button playstop;
    
    @FXML
    private Text nowartistsname;

    @FXML
    private Text nowsongname;
    

    @FXML
    private Button like;

    @FXML
    void Account(ActionEvent event) throws IOException {
         Parent ControllerParent = FXMLLoader.load(App.class.getClassLoader().getResource("pg_Account.fxml"));
        Scene startScene = new Scene(ControllerParent);

        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(startScene);
        window.show();
    }

    @FXML
    void Energize(ActionEvent event) {

    }

    @FXML
    void FeelGood(ActionEvent event) {

    }

    @FXML
    void HomeM(ActionEvent event) {

    }

    @FXML
    void Library(ActionEvent event) {

    }

    @FXML
    void Party(ActionEvent event) {

    }

    @FXML
    void Relax(ActionEvent event) {

    }

    @FXML
    void Romance(ActionEvent event) {

    }

    @FXML
    void Sad(ActionEvent event) {

    }

    @FXML
    void Search(ActionEvent event) {

    }

    @FXML
    void SearchBar(ActionEvent event) {

    }

    @FXML
    void Workout(ActionEvent event) {

    }
    @FXML
    private ImageView song1;

    @FXML
    private ImageView song10;

    @FXML
    private ImageView song11;

    @FXML
    private ImageView song12;

    @FXML
    private ImageView song2;

    @FXML
    private ImageView song3;

    @FXML
    private ImageView song4;

    @FXML
    private ImageView song5;

    @FXML
    private ImageView song6;

    @FXML
    private ImageView song7;

    @FXML
    private ImageView song8;

    @FXML
    private ImageView song9;

   

    @FXML
    private Text songtext1;

    @FXML
    private Text songtext10;

    @FXML
    private Text songtext11;

    @FXML
    private Text songtext12;

    @FXML
    private Text songtext2;

    @FXML
    private Text songtext3;

    @FXML
    private Text songtext4;

    @FXML
    private Text songtext5;

    @FXML
    private Text songtext6;

    @FXML
    private Text songtext7;

    @FXML
    private Text songtext8;

    @FXML
    private Text songtext9;
    
    @FXML
    private GridPane song_element_grid;
    
    @FXML
    void onNextBrowseButtonPressed(ActionEvent event) {

    }

    @FXML
    void onPreviousBrowseButtonPressed(ActionEvent event) {

    }
    @FXML
    void last(ActionEvent event) {

    }

    @FXML
    void likebutton(ActionEvent event) {

    }

    @FXML
    void next(ActionEvent event) {

    }


    @FXML
    void playagainbutton(ActionEvent event) {

    }

    @FXML
    void playstopbutton(ActionEvent event) {

    }


}
