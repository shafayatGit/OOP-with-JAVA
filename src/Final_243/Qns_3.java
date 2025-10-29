package Final_243;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Qns_3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("input.txt"));
            FileOutputStream fos = new FileOutputStream("output.txt");

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                for(int i = 0; i<line.length();i++){
                    if(line.charAt(i)>=0 && line.charAt(i)<=9){
                        fos.write(line.charAt(i));
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
