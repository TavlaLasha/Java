package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField output;

    public void clear(){
        output.setText("0");
    }
    public void numInput(){

    }
}
