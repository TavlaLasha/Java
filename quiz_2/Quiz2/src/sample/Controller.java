package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    String en = "abcdefghijklmnopqrstuvwxyz";
    String ge = "აბგდევზთიკლმნოპჟრსტუფღყშცძწხჯჰ";
    protected String addr = "src/sample/Files";

    @FXML
    private ComboBox<String> langCombo = new ComboBox<>();
    @FXML
    private Spinner<Integer> wordsA = new Spinner<>();
    @FXML
    private Spinner<Integer> symbsA = new Spinner<>();
    @FXML
    private TextArea textArea;
    private StringBuilder text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        langCombo.getItems().addAll("EN", "GE");
        langCombo.getSelectionModel().select("EN");
        SpinnerValueFactory<Integer> valueFactory = //
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 2);

        wordsA.setValueFactory(valueFactory);
        symbsA.setValueFactory(valueFactory);
    }

    @FXML
    public void generate(){
        for (int i = 0; i < wordsA.getValue(); i++) {
            for (int j = 0; j < symbsA.getValue(); j++) {
                if(langCombo.equals("EN")){
                    text.append(en.charAt((int)Math.floor(Math.random()*(en.length()))));
                }
                else {
                    text.append(ge.charAt((int)Math.floor(Math.random()*(ge.length()))));
                }
            }
            text.append(" ");
        }
        textArea.setText(text.toString());
    }
    public void saveText(){
        creteFolder();
        try {
            FileWriter wrt = new FileWriter(addr+"/texts.txt", true);
            wrt.write(text.toString());
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void creteFolder(){
        File directory = new File(addr);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }
}
