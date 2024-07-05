package com.hamza.associations.view;

import com.hamza.associations.AssociationsApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class MainApplication extends Application {
    private ConfigurableApplicationContext applicationContext;
//    private StageManager stageManager;

    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(AssociationsApplication.class).run();
    }

    @Override
    public void start(Stage stage) {
        applicationContext.publishEvent(new event(stage));

//        stageManager = applicationContext.getBean(StageManager.class, stage);
//        displayInitialScene();
    }
//    protected void displayInitialScene() {
//        stageManager.switchScene(FxmlView.MAIN);
//    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }

    static class event extends ApplicationEvent {
        public event(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return ((Stage) getSource());
        }
    }
}
