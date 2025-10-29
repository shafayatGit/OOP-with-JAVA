package Final_243;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Qns_4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Converter");
        JLabel footLabel = new JLabel();
        JTextField footField = new JTextField();
        JLabel inchLabel = new JLabel();
        JTextField inchField = new JTextField();
        JButton convertButton = new JButton();

        footLabel.setText("Foot");
        footLabel.setSize(20,50);
        footField.setBounds(20,100,300,30);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200,300,400,500);
        frame.add(footLabel);
        frame.add(footField);

        convertButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double foot = Double.parseDouble(footLabel.getText());
                double inch = foot/12;
                inchField.setText(String.valueOf(inch));
            }
        });
        }





    }

