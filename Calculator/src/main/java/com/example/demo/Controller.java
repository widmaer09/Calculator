package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label Screen;
    @FXML
    private Calculation calModel = new Calculation(new Addition_cal());


    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        String pressedButton = ((Button) event.getSource()).getText();
        if (!calModel.isValue2Switch()) {
            calModel.getValue1().append(pressedButton);
            Screen.setText(calModel.getValue1().toString());
        } else {
            calModel.getValue2().append(pressedButton);
            Screen.setText(calModel.getValue2().toString());
        }

    }


    @FXML
    protected void onOperationButton(ActionEvent event) {
        String pressedButton = ((Button) event.getSource()).getText();
        CalculationBehavior newOperation =new Multiplication_cal() ;
        //pressedButton.equalsIgnoreCase("*");
        if ( pressedButton.equalsIgnoreCase("+")) {
            newOperation = new Addition_cal();
        } else if ( pressedButton.equalsIgnoreCase("-")) {
            newOperation = new Subtraction_cal();
        } else if ( pressedButton.equalsIgnoreCase("*")) {
            newOperation = new Multiplication_cal();
        } else if ( pressedButton.equalsIgnoreCase("/")) {
            newOperation = new Division_cal();

        }

        calModel.setCal(newOperation);
        //newOperation = new Subtraction_cal();
        calModel.setCal(newOperation);










        calModel.setValue2Switch(true);
        Screen.setText(calModel.getValue1().toString());
    }

    @FXML
    protected void onSumButtonClick3() {
        calModel.Calculations();
        String sum = Double.toString(calModel.getSum());
        StringBuilder newValue1 = new StringBuilder(sum);
        StringBuilder newValue2 = new StringBuilder(" ");
        calModel.setValue1(newValue1);
        calModel.setValue2(newValue2);
        Screen.setText(sum);
    }

    @FXML
    protected void onClearButtonClick() {
        calModel.setValue1(new StringBuilder());
        calModel.setValue2(new StringBuilder());
        calModel.setValue2Switch(false);
        Screen.setText(calModel.getValue1().toString());
    }


}