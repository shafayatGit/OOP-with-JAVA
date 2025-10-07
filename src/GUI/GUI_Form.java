package GUI;

import javax.swing.*;

class Form extends JFrame {
    //First of all take all the variables
    JFrame frame;
    JLabel username;
    JTextField name;
    JLabel password;
    JTextField pass;
    JButton button;

    public Form() {
        //making all the objects
        frame = new JFrame("Login Form");
        username = new JLabel("User Name:");
        name = new JTextField();
        password = new JLabel("Password:");
        pass = new JTextField();
        button = new JButton("Login!");

        //opening and closing and changing the layout to default
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);//this must be set to null, or else the frame will show the components using its default layout

        //Sizing
        frame.setBounds(200,200,400,400);
        username.setBounds(10,10,100,50);
        name.setBounds(100,10,200,50);
        password.setBounds(10,100,100,50);
        pass.setBounds(100,100,200,50);
        button.setBounds(150,200,100,50);


        //adding all the labels and textFields
        frame.add(username);
        frame.add(name);
        frame.add(password);
        frame.add(pass);
        frame.add(button);

    }
}

public class GUI_Form {
    public static void main(String[] args) {
        new Form();
    }
}
