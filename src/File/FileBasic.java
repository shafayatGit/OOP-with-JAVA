package File;

import java.io.File;
import java.io.IOException;

public class FileBasic {
    public static void main(String[] args) {
        //code to create a new file
        File f1 = new File("File1");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println("Could not create the file");
        }


        //code to write a file
    }
}
