// Write a program to handle NullPointerException.
//        (Coding)

// A NullPointerException in Java is one of the most common errors.
// It means that you are trying to access a part of something that doesn't exist.

package Exception_Handling;

public class Program_04 {
    public static void main(String[] args) {
        int [] myArray = null;

        try{
            System.out.println(myArray.length);
        }catch (Exception e) {
            System.out.println("Catch Block ");
        }
        finally {
            System.out.println("NullPointerException");
            System.out.println("ALWAYS EXECUTE WEATHER EXCEPTION OCCURS OR NOT");
        }
    }
}
