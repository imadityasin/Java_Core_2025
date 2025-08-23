package Exception_Handling.custom_Exception;

// Custom checked exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);  // Properly store the message
    }
}

public class Program_02 {
    public static void main(String[] args) {
        try {
            vote(18);
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }

    public static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not Eligible for voting");
        } else {
            System.out.println("Eligible for Voting");
        }
    }
}
