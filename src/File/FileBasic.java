package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileBasic {
    public static void main(String[] args) {
        //code to create a new file
        File f1 = new File("File1.txt");
        try {
            f1.createNewFile();
        } catch (Exception e) {
            System.out.println("Could not create the file");
        }


        //code to write a file
        try{
            FileWriter fileWriter = new FileWriter("File1.txt");
            fileWriter.write("This is my new line");
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


//       Reading a file
        try{
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (Exception e){

        }

//         For deleting
        if(f1.delete()){
            System.out.println("File has deleted");
        }
        else {
            System.out.println("Not deleted!");
        }


    }
}
