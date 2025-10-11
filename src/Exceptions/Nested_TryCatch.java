package Exceptions;

public class Nested_TryCatch {

    public static void main(String[] args) {

        /// Case 1 : No exception
//       try
//        {
//            System.out.println("outer try starts");
//            try
//            {
//                System.out.println("inner try starts");
//                System.out.println(10/10);
//                System.out.println("inner try ends");
//            }
//            catch(ArithmeticException e)
//            {
//                System.out.println("inner catch");
//                System.out.println(e);
//            }
//            finally
//            {
//                System.out.println("inner finally");
//            }
//            System.out.println("outer try ends");
//        }
//        catch(NullPointerException e)
//        {
//            System.out.println("outer catch");
//            System.out.println(e);
//        }
//        finally
//        {
//            System.out.println("Outer finally");
//        }

        ///Case 2 : Exception in inner try + caught in inner catch
        /*try {
            System.out.println("outer try starts");
            try {
                System.out.println("inner try starts");
                System.out.println(10 / 0);
                System.out.println("inner try ends"); //this line is skipped as exception thrown in previous line
            } catch (ArithmeticException e) {
                System.out.println("inner catch");
                System.out.println(e);
            } finally {
                System.out.println("inner finally");
            }
            System.out.println("outer try ends"); //this line runs as the above try catch block does not throw exception
        } catch (NullPointerException e) // no exception in try block so no catch
        {
            System.out.println("outer catch");
            System.out.println(e);
        } finally {
            System.out.println("Outer finally");
        }*/

        ///Case 3 : Exception in inner try + not caught in inner catch + caught in outer catch
        /*try {
            System.out.println("outer try starts");
            try {
                System.out.println("inner try starts");
                int arr[] = new int[5];
                arr[100] = 10;
                System.out.println("inner try ends"); //this line is skipped as exception thrown in previous line
            } catch (ArithmeticException e) //does not run as cannot catch ArrayIndexOutOfBoundsException
            {
                System.out.println("inner catch");
                System.out.println(e);
            } finally //finally always runs if try-catch block is entered
            {
                System.out.println("inner finally");
            }
            System.out.println("outer try ends"); //*******this line is skipped as above block throws exception
        } catch (ArrayIndexOutOfBoundsException e) // the exception from the try block is caught here
        {
            System.out.println("outer catch");
            System.out.println(e);
        } finally {
            System.out.println("Outer finally");
        }*/

        //Case 4 : Exception in inner try + not caught in inner catch + not caught in outer catch
        /*try
        {
            System.out.println("outer try starts");
            try
            {
                System.out.println("inner try starts");
                int arr[] = new int[5];
                arr[100] = 10;
                System.out.println("inner try ends"); //this line is skipped as exception thrown in previous line
            }
            catch(ArithmeticException e) //does not run as cannot catch ArrayIndexOutOfBoundsException
            {
                System.out.println("inner catch");
                System.out.println(e);
            }
            finally //finally always runs if try-catch block is entered
            {
                System.out.println("inner finally");
            }
            System.out.println("outer try ends"); //this line is skipped as above block throws exception
        }
        catch(NullPointerException e) //does not run as cannot catch ArrayIndexOutOfBoundsException
        {
            System.out.println("outer catch");
            System.out.println(e);
        }
        finally  //finally always runs if try-catch block is entered
        {
            System.out.println("Outer finally");
        }
        //Code crashes here */

//        ///Case 5 : Exception in outer try before reaching inner try
        try {
            System.out.println("outer try starts");
            System.out.println(10 / 0);
            try //this block is not entered as exception is thrown in the line above
            {
                System.out.println("inner try starts");
                int arr[] = new int[5];
                arr[100] = 10;
                System.out.println("inner try ends");
            } catch (ArithmeticException e) {
                System.out.println("inner catch");
                System.out.println(e);
            } finally //this finally does not run as the corresponding try-catch block is not entered
            {
                System.out.println("inner finally");
            }
            System.out.println("outer try ends"); //this line is skipped as exception is thrown above
        } catch (ArithmeticException e) {
            System.out.println("outer catch");
            System.out.println(e);
        } finally  //finally always runs if try-catch block is entered
        {
            System.out.println("Outer finally");
        }


    }
}
