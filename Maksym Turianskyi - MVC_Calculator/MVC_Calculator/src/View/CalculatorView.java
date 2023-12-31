package View;

import Controller.CalculatorController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView {
    private CalculatorController calculatorController;

    private JTextField textField2;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel operator;
    private JLabel resultNum;
    private JLabel resultDenom;
    private JButton addition;
    private JButton subtraction;
    private JPanel fractionPanel;
    private JPanel mainPanel;
    private JButton multiplication;
    private JButton division;


    public CalculatorView(CalculatorController cC){
        calculatorController=cC;
        createButtons();
    }

    public JPanel getPanel() {
        return mainPanel;
    }

    private void createButtons(){
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addition();
            }
        });



        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtraction();
            }
        });

        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mutiplication();
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                division();
            }
        });

    }

    private void addition(){
        calculatorController.createFractionF1(Integer.parseInt(textField1.getText()),Integer.parseInt(textField2.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField3.getText()),Integer.parseInt(textField4.getText()));
        calculatorController.add();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("+");
    }

    private void subtraction(){
        calculatorController.createFractionF1(Integer.parseInt(textField2.getText()),Integer.parseInt(textField3.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField1.getText()),Integer.parseInt(textField4.getText()));
        calculatorController.subtract();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("-");
    }

    private void mutiplication(){
        calculatorController.createFractionF1(Integer.parseInt(textField2.getText()),Integer.parseInt(textField3.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField1.getText()),Integer.parseInt(textField4.getText()));
        calculatorController.multiply();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("*");
    }

    private void division(){
        calculatorController.createFractionF1(Integer.parseInt(textField2.getText()),Integer.parseInt(textField3.getText()));
        calculatorController.createFractionF2(Integer.parseInt(textField1.getText()),Integer.parseInt(textField4.getText()));
        calculatorController.divide();
        resultNum.setText(Integer.toString(calculatorController.getResult().getNum()));
        resultDenom.setText(Integer.toString(calculatorController.getResult().getDenom()));
        operator.setText("/");
    }

}
