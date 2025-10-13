package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorClass implements ActionListener {

    //first we have to initialize all the variables
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionsButtons = new JButton[6];
    JButton addButton, subButton, multiButton, divButton;
    JButton decButton, equalButton, delButton, clrButton;
    JPanel NumberPanel;
    JPanel OperationPanel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    int num1 = 0, num2 = 0, result = 0;
    char operator;


    CalculatorClass() {
        //setting the frame if ok or not
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        //text field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);


        //adding all the buttons and labeling
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");

        equalButton = new JButton("=");
        clrButton = new JButton("C");

        //took a array for functional all the buttons and then looped for all
        functionsButtons[0] = addButton;
        functionsButtons[1] = subButton;
        functionsButtons[2] = multiButton;
        functionsButtons[3] = divButton;
        functionsButtons[4] = equalButton;
        functionsButtons[5] = clrButton;


        for (int i = 0; i < 6; i++) {
            functionsButtons[i].addActionListener(this);
            functionsButtons[i].setFont(myFont);
            functionsButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        //delButton.setBounds(50, 430, 145, 50);
        //clrButton.setBounds(205, 430, 145, 50);


        //took a panel then set the values and layout and styles
        NumberPanel = new JPanel();
        NumberPanel.setBounds(50, 100, 200, 300);
        NumberPanel.setLayout(new GridLayout(4, 3, 10, 10));
        NumberPanel.setBackground(Color.gray);

        OperationPanel = new JPanel();
        OperationPanel.setBounds(280, 100,100, 300);
        OperationPanel.setLayout(new GridLayout(4,1,10,10));

        //added all the numbers to number panel
        for(int i = 0; i<10; i++){
            NumberPanel.add(numberButtons[i]);
        }

//        NumberPanel.add(numberButtons[1]);
//        NumberPanel.add(numberButtons[2]);
//        NumberPanel.add(numberButtons[3]);
//        NumberPanel.add(numberButtons[4]);
//        NumberPanel.add(numberButtons[5]);
//        NumberPanel.add(numberButtons[6]);
//        NumberPanel.add(numberButtons[7]);
//        NumberPanel.add(numberButtons[8]);
//        NumberPanel.add(numberButtons[9]);
//        NumberPanel.add(numberButtons[0]);
        NumberPanel.add(clrButton);
        NumberPanel.add(equalButton);



        OperationPanel.add(addButton);
        OperationPanel.add(subButton);
        OperationPanel.add(multiButton);
        OperationPanel.add(divButton);


        //panel.add(divButton);

        frame.add(NumberPanel);
        frame.add(OperationPanel);
        frame.add(textField);


    }

    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == addButton) {
            num1 = Integer.parseInt(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Integer.parseInt(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == multiButton) {
            num1 = Integer.parseInt(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Integer.parseInt(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if(e.getSource()==clrButton){
            textField.setText("");
        }
        if (e.getSource() == equalButton) {
            num2 = Integer.parseInt(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }




    }
}

public class Calculator {
    public static void main(String[] args) {

        new CalculatorClass();
    }
}
