package sample;

import javafx.application.Application;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;

public class UniversityDTO {
    IntegerProperty id = new SimpleIntegerProperty();
    StringProperty name = new SimpleStringProperty();
    IntegerProperty number = new SimpleIntegerProperty();
    StringProperty address = new SimpleStringProperty();
    IntegerProperty code = new SimpleIntegerProperty();

    public IntegerProperty idProperty() {
        return id;
    }
    public StringProperty nameProperty() {
        return name;
    }
    public IntegerProperty numberProperty() {
        return number;
    }
    public StringProperty addressProperty() {
        return address;
    }
    public IntegerProperty codeProperty() {
        return code;
    }

    public UniversityDTO(int idValue, String nameValue,  int numberValue, String addressValue, int codeValue) {
        id.set(idValue);
        name.set(nameValue);
        number.set(numberValue);
        address.set(addressValue);
        code.set(codeValue);
    }

    UniversityDTO(){}
}
