package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // int x = sc.nextInt();  -------->>> if i input anything without integer then it will give error InputMismatchException
            int y = Integer.parseInt("12a"); //Converts string to int
            System.out.println("y = " + y);

            double d = Double.parseDouble("123.56"); //Converts string to double
            System.out.println("d = " + d);
        } catch (InputMismatchException e) //if wrong type of input given
        {
            System.out.println(e);
        } catch (NumberFormatException e) //if wrong format given e.g in parseInt() function
        {
            System.out.println(e);
        }

        //converting int to string
        int a = 123;
        String s1 = a + "";
        System.out.println("s1 = " + s1);


    }

}