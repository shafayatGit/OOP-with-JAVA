package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calc implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numbers = new JButton[10];
    JButton[] functionButton = new JButton[6];
    JButton addButton, subButton, multiButton, divButton, clearButton, equalButton;
    JPanel numPanel, funcPanel;

    int num1, num2, result;
    char operations;

    Calc() {
        frame = new JFrame("FX991-MS");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 550);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 405, 80);
        textField.setEditable(false);

        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(String.valueOf(i));
            numbers[i].addActionListener(this);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        clearButton = new JButton("C");
        equalButton = new JButton("=");

        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = multiButton;
        functionButton[3] = divButton;
        functionButton[4] = clearButton;
        functionButton[5] = equalButton;


        for (int i = 0; i < 6; i++) {
            functionButton[i].addActionListener(this);
        }

        numPanel = new JPanel();
        numPanel.setBounds(50, 130, 300, 350);
        numPanel.setLayout(new GridLayout(4, 3));
        for (int i = 9; i >= 0; i--) {
            numPanel.add(numbers[i]);
        }

        numPanel.add(clearButton);
        numPanel.add(equalButton);

        funcPanel = new JPanel();
        funcPanel.setBounds(360, 130, 100, 350);
        funcPanel.setLayout(new GridLayout(4, 1));
        funcPanel.add(addButton);
        funcPanel.add(subButton);
        funcPanel.add(multiButton);
        funcPanel.add(divButton);


        frame.add(numPanel);
        frame.add(funcPanel);
        frame.add(textField);
        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numbers[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == addButton) {
            num1 = Integer.parseInt(textField.getText());
            operations = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Integer.parseInt(textField.getText());
            operations = '-';
            textField.setText("");
        }
        if (e.getSource() == multiButton) {
            num1 = Integer.parseInt(textField.getText());
            operations = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Integer.parseInt(textField.getText());
            operations = '/';
            textField.setText("");
        }

        if (e.getSource() == clearButton) {
            num1 = num2 = result = 0;
            textField.setText("");
        }

        if (e.getSource() == equalButton) {
            num2 = Integer.parseInt(textField.getText());

            switch (operations) {
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
                    if (num2 == 0) {
                        textField.setText("Error: Divide by 0");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
        }
    }


}

public class Calculator_Assignment {
    public static void main(String[] args) {
        new Calc();
    }
}
