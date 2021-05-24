package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;
import java.util.ArrayList;

public class ViewController {
    private String dburl = "jdbc:mysql://localhost:3306/university";

    @FXML
    private TableView<UniversityDTO> tb = new TableView<>();

    @FXML
    public void getData(){
        try {
            Connection con = DriverManager.getConnection(dburl, "root", "");
            String query = "select * from universities";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ObservableList dbData = FXCollections.observableArrayList(dataBaseArrayList(rs));

            for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++) {
                TableColumn column = new TableColumn<>();
                switch (rs.getMetaData().getColumnName(i+1)) {
                    case "id":
                        column.setText("ID");
                        break;
                    case "name":
                        column.setText("დასახელება");
                        break;
                    case "number":
                        column.setText("ნომერი");
                        break;
                    case "address":
                        column.setText("მისამართი");
                        break;
                    default: column.setText(rs.getMetaData().getColumnName(i+1)); //if column name in SQL Database is not found, then TableView column receive SQL Database current column name (not readable)
                        break;
                }
                column.setCellValueFactory(new PropertyValueFactory<>(rs.getMetaData().getColumnName(i+1))); //Setting cell property value to correct variable from Person class.
                tb.getColumns().add(column);
            }
            tb.setItems(dbData);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private ArrayList dataBaseArrayList(ResultSet resultSet) throws SQLException {
        ArrayList<UniversityDTO> data =  new ArrayList<>();
        while (resultSet.next()) {
            UniversityDTO uni = new UniversityDTO();
            uni.id.set(resultSet.getInt("id"));
            uni.name.set(resultSet.getString("name"));
            uni.number.set(resultSet.getInt("number"));
            uni.address.set(resultSet.getString("address"));
            data.add(uni);
        }
        return data;
    }
}
