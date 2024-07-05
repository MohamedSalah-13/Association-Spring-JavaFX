package com.hamza.associations.view;

import java.util.ResourceBundle;

public enum FxmlView {

    MAIN {
        @Override
        String getTitle() {
            return getStringFromResourceBundle("main.app.title");
        }

        @Override
        String getFxmlFile() {
            return "/view/associations.fxml";
        }
    }, DETAILS {
        @Override
        String getTitle() {
            return getStringFromResourceBundle("login.title");
        }

        @Override
        String getFxmlFile() {
            return "/view/details.fxml";
        }
    };
    
    abstract String getTitle();
    abstract String getFxmlFile();
    
    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }

}
