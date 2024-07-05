package com.hamza.associations.controller;

import com.hamza.associations.entity.Floor;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class AddFloorController {

    private int size;
    private double amount;
    @FXML
    private VBox vBox_center;

    public AddFloorController(int size, double amount, List<Floor> floorList) {

    }

    @FXML
    private void initialize() {

    }

    private void extracted(List<Floor> floorList) {
        if (!floorList.isEmpty()) {
            for (Floor floor : floorList) {
//                vBox_center.getChildren().add(getE(floorList, floor));
            }
        } else {
            Floor floor = new Floor(1, amount);
            floorList.add(floor);
//            vBox_center.getChildren().add(getE(floorList, floor));
        }
    }

//    private Add_Box getE(List<Floor> floorList, Floor floor) {
//        Add_Box floorAddBox = new Add_Box(floor, floorList, vBox_center, getIntegerList());
//        ComboBox<Integer> comboBox = floorAddBox.getComboBox();
//        TextField textField = floorAddBox.getTextField();
////        textField.setText(String.valueOf(floor.getAmount()));
////        comboBox.getSelectionModel().select(floor.getNumber_floor());
//        comboBox.valueProperty().addListener((observableValue, integer, t1) -> {
//            if (t1 != null) {
//                floor.setNumber_floor(t1);
//                floor.setAmount(Double.parseDouble(textField.getText()));
//            }
//        });
//
//        textField.textProperty().addListener((observableValue, s, t1) -> {
//            if (t1 != null) {
//                floor.setNumber_floor(comboBox.getSelectionModel().getSelectedItem());
//                floor.setAmount(Double.parseDouble(t1));
//            }
//        });
//
//        return floorAddBox;
//    }

    private List<Integer> getIntegerList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i + 1);
        }
        return list;
    }

}