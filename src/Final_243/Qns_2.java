package Final_243;


class InvalidAgeException extends Exception{
    InvalidAgeException(String message){};
}

public class Qns_2 {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Valid age: " + age);
    }
    public static void main(String[] args) {
        try {
            validate(12);
        }
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
