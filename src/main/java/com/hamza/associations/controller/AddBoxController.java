package com.hamza.associations.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class AddBoxController implements FxmlController {

    @FXML
    private ComboBox<Integer> comboBox;
    @FXML
    private TextField textField;
    @FXML
    private Button add, remove;

    @Override
    public void initialize() {
       /* comboBox.getItems().clear();
        comboBox.getItems().addAll(comboList);

        textField.setText(String.valueOf(floor1.getAmount()));
        comboBox.getSelectionModel().select((Integer) floor1.getNumber_floor());

        add.setOnAction(actionEvent -> {
            Floor floor = new Floor(1, 1000);
            vBox.getChildren().add(new Add_Box(floor, list, vBox, comboList));
            list.add(floor);

        });

        remove_add.setOnAction(actionEvent -> {
            if (vBox.getChildren().size() > 1) {
                list.remove(floor1);
                vBox.getChildren().remove(this);
            }
        });*/
    }

}
