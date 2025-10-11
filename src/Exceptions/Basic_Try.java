package Exceptions;

public class Basic_Try {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try
        {
            //risky code written in try
            System.out.println("a/b = " + a/b); //ArithmeticException
        }
        catch(Exception e) // catch runs if exception occurs in try block
        {
            System.out.println("Catch block - divide by zero");
            System.out.println(e); // Prints the exception : message
        }

        System.out.println("Main continues");

        int arr[] = new int[5];

        try
        {
            arr[100] = 90; // ArrayIndexOutOfBounds
        }
        catch(Exception e)
        {
            System.out.println("Catch block - array index out of bound");
            System.out.println(e);
            System.out.println(e.getMessage()); // see message
        }

        System.out.println("Main continues");



    }

}
