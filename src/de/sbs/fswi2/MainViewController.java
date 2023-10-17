package de.sbs.fswi2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainViewController implements Initializable {

    private Stage stage;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        lblDatum.setText("hallo");
    }

    @FXML
    private void beenden(ActionEvent event) {
        Platform.exit();
    }

    public void setStage(Stage stage){
        this.stage = stage;
        stage.setTitle("lagerverwaltung");
    }
   
    @FXML
    private Label lblDatum;

}
