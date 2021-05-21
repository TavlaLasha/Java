package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Controller {
    private ArrayList<Double> numArray = new ArrayList<>();
    private ArrayList<Character> operationArray = new ArrayList<>();
    private ArrayList<Character> operationExArray = new ArrayList<>(Arrays.asList('÷','×', '-', '+'));

    @FXML
    public TextField output;

    public void clear(){
        output.setText("0");
        numArray.clear();
        operationArray.clear();
    }

    public void numInput(ActionEvent event){
        Button button = (Button) event.getSource();
        if(output.getText().length()==1 && output.getText().equals("0")){
            output.setText("");
            numArray.add(Double.parseDouble(button.getText()));
        }
        else {
            if (operationExArray.contains(output.getText().charAt(output.getText().length() - 1))) {
                numArray.add(Double.parseDouble(button.getText()));
            } else {
                if(numArray.get(numArray.toArray().length - 1)%1==0) {
                    String sb = String.valueOf(numArray.get(numArray.toArray().length - 1).intValue()) + button.getText();
                    if(2147483647.0 < Double.parseDouble(sb)){return;}
                    numArray.set(numArray.toArray().length - 1, Double.parseDouble(sb));
                }
            }
        }
        output.setText(output.getText()+button.getText());
    }
    public void operationInput(ActionEvent event){
        Button button = (Button) event.getSource();
        if(!operationExArray.contains(output.getText().charAt(output.getText().length()-1))){
            operationArray.add(button.getText().charAt(0));
            output.setText(output.getText()+button.getText());
        }
    }
    public void equal(){
        double num1 = 0, num2;
        Character op;
        for(int i=0; i < operationArray.toArray().length; i++){
            num1 = numArray.get(0);
            num2 = numArray.get(1);

            op = operationArray.get(i);
            switch (op) {
                case '+' ->  num1 += num2;
                case '-' -> num1 -= num2;
                case '÷' -> num1 /= num2;
                case '×' -> num1 *= num2;
            }
            numArray.remove(1);
            numArray.set(0, num1);
        }
        numArray.clear();
        operationArray.clear();
        numArray.add(num1);
        if(num1%1==0){
            output.setText(String.valueOf((int)num1));
        }
        else{
            output.setText(String.valueOf(num1));
        }
    }
}
