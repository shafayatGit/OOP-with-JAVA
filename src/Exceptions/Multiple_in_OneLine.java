package Exceptions;

public class Multiple_in_OneLine {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int arr[] = new int[5];

        try {
            arr[100] = a / b; //2 exceptions in the same line
        } catch (Exception e) {
            // the exception that occurs first is caught
            // here Arithmetic is caught as a/b is calculated first then assigned to the array
            System.out.println(e);
        }


    }
}
