package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class Controller {
    @FXML
    private Label result;
    private long numb1 = 0;
    private String operator ="";
    private boolean status = false;
    private functionality functions = new functionality();
    @FXML
    public void processnumber(ActionEvent event){
        if (status == false){
            result.setText("");
            status = true;
        }
        String number = ((Button)event.getSource()).getText();
        result.setText(result.getText()+number);
    }

    @FXML
    public void processoperator(ActionEvent event){
        String number = ((Button)event.getSource()).getText();
        if(!number.equals("=")){
            if (!operator.isEmpty()){
                return;
            }
            operator = number;
            numb1 = Long.parseLong(result.getText());
            result.setText("");
        }else{
            if (operator.isEmpty()){
                return;
            }
            long numb2 = Long.parseLong(result.getText());
            float output = functions.calculate(numb1,numb2,operator);
            result.setText(String.valueOf(output));
            operator ="";
            status = false;
        }


    }
}
