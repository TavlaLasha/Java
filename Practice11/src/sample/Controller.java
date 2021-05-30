package sample;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Controller {
    private String dburl = "jdbc:mysql://localhost:3306/realestate";
    private static Integer selectedId;

    public void setSelectedId(Integer selectedId) {
        Controller.selectedId = selectedId;
    }
    public Integer getSelectedId() {
        return selectedId;
    }

    @FXML
    private BorderPane mainPane;
    @FXML
    protected Button editBTN;
    @FXML
    protected Button deleteBTN;

    @FXML
    public void add(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("save.fxml"));
        Pane root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainPane.setCenter(root);
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
    @FXML
    public void edit(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("save.fxml"));
            Pane root = loader.load();
            mainPane.setCenter(root);
            SaveController controller = loader.getController();
            controller.update();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    public void delete(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("DeleteConfirmation");
        alert.setHeaderText("Are you sure?");
        alert.setContentText("Delete can not be undone.");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            try {
                if (selectedId != null) {
                    Connection con = DriverManager.getConnection(dburl, "root", "");
                    String query = "delete from estate where id=?";
                    PreparedStatement st = con.prepareStatement(query);
                    st.setInt(1, selectedId);
                    st.executeUpdate();
                    st.close();
                    Alert a = new Alert(Alert.AlertType.INFORMATION, "Success!");
                    a.show();
                } else {
                    Alert a = new Alert(Alert.AlertType.WARNING, "Please Select Data in View");
                    a.show();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
