package File;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class Code1 {

    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<>();

        try // Need try-catch as File operations throw checked exception
        {
            // Read File.

            Scanner sc = new Scanner(new File("Student.txt"));
            // create File object as Scanner parameter
            // the file is in the Project folder
            // for file in Source folder, the path should be "src/Student.txt"
            // can use any other streams for reading files
            // but Scanner has all functionalities and we already know the syntax of Scanner

            FileOutputStream fos = new FileOutputStream("Student2.txt");
            // for writing to Files
            // can use any other streams for writing files, I am just teaching an easy one

            while(sc.hasNextLine()) // loop runs until file ends (no more lines found in file)
            {
                /// Processing

                String line = sc.nextLine();
                String [] info = line.split(" "); // split returns a String array
                // info[0] -> name, info[1] -> id as String, info[2] -> cgpa as String

                int id = Integer.parseInt(info[1]);
                double cgpa = Double.parseDouble(info[2]);

                arr.add(new Student(info[0],id, cgpa)); //create a new Student and add to the ArrayList

                /// Writing

                String output = "Name: " + info[0] + "\n" + "ID: " + info[1] + "\n" + "CGPA: " + info[2] + "\n\n";
                // create the String that you want to write in your file
                fos.write(output.getBytes());
                // write function writes in Bytes, so call getBytes() function of the String to get Bytes

            }

            sc.close();
            fos.close();
            // Always close streams after work is done

            System.out.println("arr = " + arr);

        }
        catch(Exception e){}
    }
}
