//// Write a program to handle NullPointerException.
////        (Coding)
//
//// A NullPointerException in Java is one of the most common errors.
//// It means that you are trying to access a part of something that doesn't exist.
//// Occurs when you try to access methods or properties of a null object.
//
//package Exception_Handling;
//
//public class Program_05 {
//    public static void main(String[] args) {
//        String name = null; // No object assigned
//
//        try {
//            System.out.println(name.toLowerCase()); // Will throw NullPointerException
//        } catch (NullPointerException e) {
//            System.out.println("Exception Occurred: Cannot convert null to lowercase.");
//        } finally {
//            System.out.println("Finally block will always execute whether exception occurs or not.");
//            System.out.println("NullPointerException occurs when you try to access methods/fields on a null object.");
//        }
//    }
//}
