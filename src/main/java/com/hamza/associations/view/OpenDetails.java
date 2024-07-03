package com.hamza.associations.view;

import com.hamza.associations.AssociationsApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OpenDetails extends Application {

    private ConfigurableApplicationContext springContext;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/details.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Details");
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        springContext.stop();
    }

    @Override
    public void init() {
        springContext = new SpringApplicationBuilder(AssociationsApplication.class).run();
    }

}
