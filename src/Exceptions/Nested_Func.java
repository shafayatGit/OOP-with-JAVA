package Exceptions;

class A
{
    public static void f1()
    {
        try
        {
            f2();
        }
        catch(ArithmeticException e) //exception is caught here, so not forwarded to main
        {
            System.out.println("f1 catch");
            System.out.println(e);
        }

    }

    public static void f2()
    {
        f3(); // exception forwarded to f1

    }

    public static void f3()
    {
        try
        {
            System.out.println(10/0);
        }
        catch(NullPointerException e) // exception not caught here, forwarded to f2
        {
            System.out.println("f3 catch");
            System.out.println(e);
        }

    }
}

public class Nested_Func {

    public static void main(String[] args) {

        try
        {
            A.f1();
            System.out.println("main try"); // this line runs as exception is caught in f1
        }
        catch(Exception e) //this catch block does not execute
        {
            System.out.println("main catch");
            System.out.println(e);
        }
    }

}