package Final_251;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Final_251_2 {

    public static void main(String[] args) {

        try
        {
            Scanner sc = new Scanner(new File("src/student.txt"));
            FileOutputStream fos1 = new FileOutputStream("src/info.txt");
            FileOutputStream fos2 = new FileOutputStream("src/mark.txt");

            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String details[] = line.split(" ");
                int sum = Integer.parseInt(details[2]) + Integer.parseInt(details[3]);
                String s1 = details[0] + " " + details[1] + "\n";
                String s2 = details[1] + " " + sum + "\n";
                fos1.write(s1.getBytes());
                fos2.write(s2.getBytes());
            }

            sc.close();
            fos1.close();
            fos2.close();
        }
        catch(Exception e){}
    }
}
