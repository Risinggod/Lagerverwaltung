package de.sbs.fswi2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("./mainview.fxml"));
        loader.setRoot(new BorderPane());
        Parent rootNode = loader.load();
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.show();
        
        MainViewController controller = (MainViewController) loader.getController();
        controller.setStage(stage);
    
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
