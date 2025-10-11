package Exceptions;

//making an exception
class WrongMarkException extends Exception {
    //To create your own exception, extends some Exception class
    //Can create Checked or Unchecked exception depending on the parent class used

    WrongMarkException() {
        //can send the message using the parent constructor
        super("Mark is outside 0-100");
    }
}


//throwing in to a class
class Calculator {
    public static void checkMarks(int marks) throws WrongMarkException { //we used public static for accessing directly
        if (marks < 0 || marks > 100) {
            // you can use throw to manually throw an exception
            // for user made exceptions, you need to throw them manually
            // throw an exception object
            // for CheckedException, either try-catch or throws is needed

            throw new WrongMarkException(); // must have to use throw new

        } else {
            System.out.println("Valid Marks");
        }
    }
}

public class User_defined {

    public static void main(String[] args) {

        try {
            Calculator.checkMarks(900);
        } catch (WrongMarkException e) {
            System.out.println(e);
        }


    }

}
