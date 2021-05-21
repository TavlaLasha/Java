package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {

    @FXML
    public Label label1;

    public void method(){
        System.out.println("Java FX");
        label1.setText("Hello Java FX");
    }
}
