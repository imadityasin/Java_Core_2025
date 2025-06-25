////ArrayIndexOutOfBoundsException
////Occurs when you try to access an invalid index of an array.
//
//package Exception_Handling;
//
//public class Program_06 {
//    public static void main(String[] args) {
//        int arr[] = new int[10]; // Valid indexes: 0 to 9
//
//        try {
//            arr[65] = 78; // Invalid index, will throw ArrayIndexOutOfBoundsException
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception Caught: Index out of bounds.");
//        } finally {
//            System.out.println("Finally block will execute whether exception occurs or not.");
//        }
//    }
//}