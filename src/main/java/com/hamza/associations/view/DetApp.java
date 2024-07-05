package com.hamza.associations.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DetApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = FXMLLoader.load(getClass().getResource(FxmlView.DETAILS.getFxmlFile()));
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
