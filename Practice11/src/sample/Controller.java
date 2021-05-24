package sample;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Callback;

public class Controller {
    private String dburl = "jdbc:mysql://localhost:3306/realestate";

    @FXML
    private BorderPane mainPane;

    @FXML
    public void save(){
        FxmlLoader ob = new FxmlLoader();
        Pane view = ob.getPage("save");
        mainPane.setCenter(view);
    }

    @FXML
    public void view(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
            Pane root = loader.load();
            mainPane.setCenter(root);
            ViewController controller = loader.getController();
            controller.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
