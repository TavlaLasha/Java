package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class ViewController extends Controller implements Initializable {
    private String dburl = "jdbc:mysql://localhost:3306/realestate";
    private Integer selectedId = null;

    @FXML
    private TableView<Estate> viewTable = new TableView<>();

    @FXML
    public void getData(){
        try {
            Connection con = DriverManager.getConnection(dburl, "root", "");
            String query = "select * from estate";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ObservableList dbData = FXCollections.observableArrayList(dataBaseArrayList(rs));

            for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++) {
                TableColumn column = new TableColumn<>();
                switch (rs.getMetaData().getColumnName(i+1)) {
                    case "id":
                        column.setText("ID");
                        break;
                    case "sellType":
                        column.setText("გარიგების ტიპი");
                        break;
                    case "country":
                        column.setText("მდებარეობა");
                        break;
                    case "street":
                        column.setText("უბანი");
                        break;
                    case "type":
                        column.setText("ქონების ტიპი");
                        break;
                    case "rooms":
                        column.setText("ოთახების რაოდენობა");
                        break;
                    case "price":
                        column.setText("ფასი");
                        break;
                    case "email":
                        column.setText("ელ-ფოსტა");
                        break;
                    case "mobile":
                        column.setText("მობილური");
                        break;
                    case "description":
                        column.setText("განცხადების ტექსტი");
                        break;
                    default: column.setText(rs.getMetaData().getColumnName(i+1)); //if column name in SQL Database is not found, then TableView column receive SQL Database current column name (not readable)
                        break;
                }
                column.setCellValueFactory(new PropertyValueFactory<>(rs.getMetaData().getColumnName(i+1))); //Setting cell property value to correct variable from Person class.
                viewTable.getColumns().add(column);
            }
            viewTable.setItems(dbData);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private ArrayList dataBaseArrayList(ResultSet resultSet) throws SQLException {
        ArrayList<Estate> data =  new ArrayList<>();
        while (resultSet.next()) {
            Estate estate = new Estate();
            estate.id.set(resultSet.getInt("id"));
            estate.sellType.set(resultSet.getString("sellType"));
            estate.country.set(resultSet.getString("country"));
            estate.street.set(resultSet.getString("street"));
            estate.type.set(resultSet.getString("type"));
            estate.rooms.set(resultSet.getFloat("rooms"));
            estate.price.set(resultSet.getString("price"));
            estate.email.set(resultSet.getBoolean("email"));
            estate.mobile.set(resultSet.getBoolean("mobile"));
            estate.description.set(resultSet.getString("description"));
            data.add(estate);
        }
        return data;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setSelectedId(selectedId);
        viewTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null) {
                selectedId = null;
                return;
            }
            selectedId = newValue.id.get();
            setSelectedId(selectedId);
        });
    }

}
