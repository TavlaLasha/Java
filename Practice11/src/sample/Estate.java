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

public class Estate {
    IntegerProperty id = new SimpleIntegerProperty();
    StringProperty sellType = new SimpleStringProperty();
    StringProperty country = new SimpleStringProperty();
    StringProperty street = new SimpleStringProperty();
    StringProperty type = new SimpleStringProperty();
    IntegerProperty rooms = new SimpleIntegerProperty();
    DoubleProperty price = new SimpleDoubleProperty();
    BooleanProperty email = new SimpleBooleanProperty();
    BooleanProperty mobile = new SimpleBooleanProperty();
    StringProperty description = new SimpleStringProperty();

    public IntegerProperty idProperty() {
        return id;
    }
    public StringProperty sellTypeProperty() {
        return sellType;
    }
    public StringProperty countryProperty() {
        return country;
    }
    public StringProperty streetProperty() {
        return street;
    }
    public StringProperty typeProperty() {
        return type;
    }
    public IntegerProperty roomsProperty() {
        return rooms;
    }
    public DoubleProperty priceProperty() {
        return price;
    }
    public BooleanProperty emailProperty() {
        return email;
    }
    public BooleanProperty mobileProperty() {
        return mobile;
    }
    public StringProperty descriptionProperty() {
        return description;
    }

    public Estate(int idValue, String sellTypeValue, String countryValue, String streetValue, String typeValue, int roomsValue, Double priceValue, boolean emailValue, boolean mobileValue, String descValue) {
        id.set(idValue);
        sellType.set(sellTypeValue);
        country.set(countryValue);
        street.set(streetValue);
        type.set(typeValue);
        rooms.set(roomsValue);
        price.set(priceValue);
        email.set(emailValue);
        mobile.set(mobileValue);
        description.set(descValue);
    }

    Estate(){}
}
