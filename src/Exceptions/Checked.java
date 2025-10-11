package Exceptions;

import java.io.IOException;

class C1
{
    // throws forwards the exception to the calling function
    // no need for try-catch if throws is used
    // the caller of the function has to handle the exception
    // Checked exceptions must be handled in code - compile time error (red underlines)
    // Unchecked exception are not required to be handled - run time error

    public static void f1() throws Exception //Checked exception
    {
        System.out.println("f1 starts");
        System.out.println(10/0);
        System.out.println("f1 ends");
    }

    public static void f2() throws ArithmeticException //Unchecked exception
    {
        // For Unchecked exceptions, throws is not required although can be written
        System.out.println(10/10);
    }

    public static void f3() throws IOException //Checked Exception
    {
        System.out.println("f3");
    }

}

public class Checked {

    public static void main(String[] args) {

        System.out.println("Main starts");

        try
        {
            C1.f1(); //must handle with try-catch (checked exception)
        }
        catch(Exception e){
            System.out.println(e);
        }

        C1.f2(); //not forced to handle unchecked exception with try-catch

        try
        {
            C1.f3(); // must handle by try-catch
        }
        catch(Exception e){}

        System.out.println("Main ends");

    }

}
