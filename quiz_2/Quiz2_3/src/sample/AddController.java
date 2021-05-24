package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;

public class AddController {
    private String dburl = "jdbc:mysql://localhost:3306/university";

    @FXML
    private TextField name;
    @FXML
    private TextField address;
    @FXML
    private TextField number;
    @FXML
    private TextField code;

    @FXML
    public void add(){
        try {
            Connection con = DriverManager.getConnection(dburl, "root", "");
            String query = "INSERT INTO universities (name, number, address, code) VALUES(?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, name.getText());
            st.setInt(2, Integer.parseInt(number.getText()));
            st.setString(3, address.getText());
            st.setInt(4, Integer.parseInt(code.getText()));
            st.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
