package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class MainViewController implements Initializable {

   

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        lblDatum.setText("hallo");
    }

    @FXML
    private void beenden(ActionEvent event) {
        Platform.exit();
    }

 
   
    @FXML
    private Label lblDatum;

}
