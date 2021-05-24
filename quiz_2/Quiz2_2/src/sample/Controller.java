package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Controller {
    private String addr = "src/sample/Files";

    @FXML
    private TextField formula;
    @FXML
    private TextField answer;

    public void calculate(){
        try {
            String formla = formula.getText();
            int opIndex = -1, num1, num2;
            char operation = 0;

            if(formla.indexOf( '+') != -1){
                opIndex = formla.indexOf( '+');
                operation = formla.charAt(opIndex);
            }
            else if(formula.getText().indexOf( 'x') != -1){
                opIndex = formla.indexOf( 'x');
                operation = formla.charAt(opIndex);
            }
            else{
                System.out.println("Error. Operation not found");
            }

            num1 = Integer.parseInt(formla.substring(0,opIndex));
            num2 = Integer.parseInt(formla.substring(opIndex+1));
            switch (operation){
                case '+':
                    answer.setText(String.valueOf(num1+num2));
                    break;
                case 'x':
                    answer.setText(String.valueOf(num1*num2));
                    break;
                default:
                    System.out.println("Error. Operation not found");
            }
            saveData(answer.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void saveData(String data){
        creteFolder();
        try {
            FileWriter wrt = new FileWriter(addr+"/calculations.txt", true);
            Date date = new Date();
            wrt.write("\n" + date.toString() + "--> " + data);
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
