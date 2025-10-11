package Exceptions;

public class Code2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int arr[] = new int[5];

        try
        {
            System.out.println("a/b = " + a/b); // if error occurs here, code jumps to catch, other try block lines not executed
            System.out.println("Inside Try");
            arr[100] = 50;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("*****************************************");


        // Multiple Catch Block

        int x = 10;
        int y = 10;
        int arr2[] = new int[5];
        int wrongIndex = 9;
        String s1 = null;


        try
        {
            System.out.println("x/y = " + x/y);
            System.out.println("Inside Try");
            arr2[wrongIndex] = 50;
            System.out.println("Lower Case String s1 = " + s1.toLowerCase());
        }
        catch(ArithmeticException e) //catches ArithmeticException
        {
            System.out.println(e); // message will by / by zero
            System.out.println("DO NOT DIVIDE BY ZERO PLZZZZ");
        }
        catch(ArrayIndexOutOfBoundsException e) //catches ArrayIndexOutOfBoundsException
        {
            System.out.println(e.getMessage()); //message will be Index something out of bounds for length something
            System.out.println("STAY IN YOUR INDEX LIMITS");
        }
        catch(NullPointerException e) //catches ArrayIndexOutOfBoundsException
        {
            System.out.println(e.getMessage()); //Cannot invoke "String.toLowerCase()" because "s1" is null
            System.out.println("This is Null Pointer and accessing Null");
        }
        catch(Exception e) //Extra catch block, catches all other exceptions except Arithmetic and ArrayIndex
        {
            System.out.println(e);
            System.out.println("SOME OTHER EXCEPTION OTHER THAN ARITHMETIC AND ARRAY INDEX");
        }

      /*  try
        {

        }
        catch(Exception e){} //cannot write the only exception block first, and other blocks later
        catch(ArithmeticException e){} */

    }

}
