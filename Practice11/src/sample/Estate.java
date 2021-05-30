package sample;

import javafx.beans.property.*;

public class Estate {
    IntegerProperty id = new SimpleIntegerProperty();
    StringProperty sellType = new SimpleStringProperty();
    StringProperty country = new SimpleStringProperty();
    StringProperty street = new SimpleStringProperty();
    StringProperty type = new SimpleStringProperty();
    FloatProperty rooms = new SimpleFloatProperty();
    StringProperty price = new SimpleStringProperty();
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
    public FloatProperty roomsProperty() {
        return rooms;
    }
    public StringProperty priceProperty() {
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

    public Estate(int idValue, String sellTypeValue, String countryValue, String streetValue, String typeValue, float roomsValue, String priceValue, boolean emailValue, boolean mobileValue, String descValue) {
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
