package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class Controller {
    private String dburl = "jdbc:mysql://localhost:3306/university";

    @FXML
    private BorderPane main;

    @FXML
    public void add(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("add.fxml"));
        Pane root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        main.setCenter(root);
    }

    @FXML
    public void view(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
            Pane root = loader.load();
            main.setCenter(root);
            ViewController controller = loader.getController();
            controller.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}