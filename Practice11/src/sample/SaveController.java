package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class SaveController extends Controller implements Initializable {
    private String dburl = "jdbc:mysql://localhost:3306/realestate";
    private Integer selectedId = null;

    @FXML
    private ComboBox<String> selltype;
    @FXML
    private ComboBox<String> country;
    @FXML
    private ComboBox<String> street;
    @FXML
    private ComboBox<String> type;
    @FXML
    private ComboBox<String> priceformat;
    @FXML
    private ToggleGroup room;
    @FXML
    private TextField price;
    @FXML
    private CheckBox email;
    @FXML
    private CheckBox mobile;
    @FXML
    private TextArea text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectedId = getSelectedId();
        selltype.getItems().addAll("იყიდება", "ქირავდება");
        selltype.getSelectionModel().select(0);
        country.getItems().addAll("თბილისი", "ქუთაისი", "ბათუმი");
        country.getSelectionModel().select(0);
        street.getItems().addAll("საბურთალო", "ვარკეთილი", "გლდანი");
        street.getSelectionModel().select(0);
        type.getItems().addAll("ბინა", "გარაჟი");
        type.getSelectionModel().select(0);
        priceformat.getItems().addAll("დოლარი", "ლარი");
        priceformat.getSelectionModel().select(0);
    }

    @FXML
    public void save(){
        try {
            RadioButton selectedRadioButton = (RadioButton) room.getSelectedToggle();
            Connection con = DriverManager.getConnection(dburl, "root", "");
            String query;
            PreparedStatement st;
            if(selectedId != null){
                query = "UPDATE estate SET sellType = ?, country = ?, street = ?, type = ?, rooms = ?, price = ?, email = ?, mobile = ?, description = ? WHERE id = ?";
                st = con.prepareStatement(query);
                st.setInt(10, selectedId);
            }
            else {
                query = "INSERT INTO estate (sellType, country, street, type, rooms, price, email, mobile, description) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
                st = con.prepareStatement(query);
            }
            st.setString(1, selltype.getValue());
            st.setString(2, country.getValue());
            st.setString(3, street.getValue());
            st.setString(4, type.getValue());
            st.setFloat(5, Float.parseFloat(selectedRadioButton.getText()));
            st.setString(6, price.getText() + " " + priceformat.getValue());
            st.setBoolean(7, email.isSelected());
            st.setBoolean(8, mobile.isSelected());
            st.setString(9, text.getText());
            st.executeUpdate();
            st.close();
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Success!");
            a.show();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void update(){
        if(selectedId != null){
            fillForm();
        }
        else {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setHeaderText("Please Select Data in View");
            a.show();
        }
    }
    public void fillForm(){
        try {
            Connection con = DriverManager.getConnection(dburl, "root", "");
            String query = "select * from estate where id="+selectedId;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            rs.next();
            selltype.getSelectionModel().select(rs.getString("sellType"));
            country.getSelectionModel().select(rs.getString("country"));
            street.getSelectionModel().select(rs.getString("street"));
            type.getSelectionModel().select(rs.getString("type"));
            int selectedToggleIndex = room.getToggles().indexOf(String.valueOf(rs.getFloat("rooms")));
//            room.getToggles().get(selectedToggleIndex).setSelected(true);
            price.setText(rs.getString("price").replaceAll("\\D+",""));
            priceformat.getSelectionModel().select(rs.getString("price").replaceAll("[0-9]", ""));
            email.setSelected(rs.getBoolean("email"));
            mobile.setSelected(rs.getBoolean("mobile"));
            text.setText(rs.getString("description"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
