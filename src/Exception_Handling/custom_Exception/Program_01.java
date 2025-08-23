//package Exception_Handling.custom_Exception;
//
//import java.util.Scanner;
//
//// Custom Checked Exception
//class InvalidAgeException extends Exception {
//    public InvalidAgeException(String message) {
//        super(message);
//    }
//}
//
//public class Program_01 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your age to check if you are eligible to vote: ");
//        int age = sc.nextInt();
//
//        try {
//            vote(age);
//        } catch (InvalidAgeException e) {
//            System.out.println("Exception Occurred: " + e.getMessage());
//        }
//
//        sc.close();
//    }
//
//    public static void vote(int age) throws InvalidAgeException {
//        if (age < 18) {
//            throw new InvalidAgeException("You are not eligible to vote (must be 18+).");
//        } else {
//            System.out.println("✅ You are eligible to vote.");
//        }
//    }
//}