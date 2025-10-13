package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorClass implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionsButtons = new JButton[8];
    JButton addButton, subButton, multiButton, divButton;
    JButton decButton, equalButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    double num1 = 0, num2 = 0, result = 0;
    char operator;


    CalculatorClass() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setVisible(true);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);


        addButton = new JButton("+");
        addButton = new JButton("-");
        subButton = new JButton("*");
        multiButton = new JButton("/");
        divButton = new JButton("+");
        decButton = new JButton(".");
        equalButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functionsButtons[0] = addButton;
        functionsButtons[1] = subButton;
        functionsButtons[2] = multiButton;
        functionsButtons[3] = divButton;
        functionsButtons[4] = decButton;
        functionsButtons[5] = equalButton;
        functionsButtons[6] = delButton;
        functionsButtons[7] = clrButton;


        for (int i = 0; i < 8; i++) {
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
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.gray);

        frame.add(panel);
        frame.add(textField);
        frame.add(decButton);
        frame.add(clrButton);


    }

    public void actionPerformed(ActionEvent e) {

    }
}

public class Calculator {
    public static void main(String[] args) {

        new CalculatorClass();
    }
}
