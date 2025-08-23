/*
 ClassCastException
 Invalid type casting   =   Casting Integer to String
*/

package Exception_Handling;

public class ClassCastException {
    public static void main(String[] args) {
        Object obj = "Hello";  // obj holds a String

        try {
            Integer num = (Integer) obj;  // ❌ Trying to convert String to Integer
            System.out.println(num);
        }
        catch (java.lang.ClassCastException e) {
            System.out.println("⚠️ ClassCastException occurred!");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
