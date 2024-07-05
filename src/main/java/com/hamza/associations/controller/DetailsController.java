package com.hamza.associations.controller;

import com.hamza.associations.entity.Association;
import com.hamza.associations.entity.Floor;
import com.hamza.associations.service.FloorService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import org.hamza.controlsfx.table.Column;
import org.hamza.controlsfx.table.Table_Setting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class DetailsController implements FxmlController {

    @FXML
    private TableView<Floor> tableView;
    private FloorService floorService;
    private Association association;

//    @Autowired
    public DetailsController(FloorService floorService,Association association) {
        this.floorService = floorService;
        this.association = association;
    }

    @Override
    public void initialize() {
        getTable();
        refreshData();
    }

    private void getTable() {
        tableView.getColumns().clear();
        ObservableList<Floor> list = FXCollections.observableArrayList();

        List<Column<?>> columns = new ArrayList<>(Arrays.asList(
                new Column<>(Integer.class, "number_floor", "الدور"),
                new Column<>(String.class, "due_date", "تاريخ الاستحقاق")
        ));
        Table_Setting.createTable(tableView, columns, list);
        tableView.getColumns().addFirst(Table_Setting.column_number());
    }

    private void refreshData() {
        List<Floor> allByAssociationId = floorService.findAllByAssociation_Id(association.getId());
        for (Floor floor : allByAssociationId) {
            LocalDate localDate = LocalDate.parse(association.getStart_date().toString());
            floor.setDue_date(localDate.plusMonths(floor.getNumber_floor()));
        }
        tableView.setItems(FXCollections.observableList(allByAssociationId));
    }
}
