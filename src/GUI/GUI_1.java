package GUI;

import javax.swing.*;

class frame extends JFrame{
    public frame(){ //class baanale first e constructor create korte hobe
        super("This is my new GUI");//setting the title using super
        setVisible(true); // using for visibility
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for closing the frame
        setLocationRelativeTo(null); // that will set the location to middle
        setSize(400,400);
        //setLocation(700,400); // that will take the location only.
        //setBounds(700,400,400,400);	//set left corner and length width at the same time
    }
}

public class GUI_1 {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setVisible(true); //setVisible na dile window show korbena but problem hocche close button e click korlei close hoye jabena
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //etar mane exit korlei close hoye jaabe.
//        frame.setSize(600,600); // setSize(width,height)
//        frame.setLocationRelativeTo(null); //eta diye ekdm center e chole ashbe

//        Ekhaner shobkichu amra ekta specific class er vitore korbo

        new frame();

    }
}
