// Arithmetic Exception

// Illegal math operation   =	Divide by zero


package Exception_Handling;

public class ArithmeticException {
    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
            int divide=a/b;
            System.out.println(" A Divide by B = " +divide);
        } catch (Exception e) {
            System.out.println(" Exception Occurs, this is catch block ");
        } finally {
            System.out.println(" Finally will run weather Exception occur or not. ");
        }
    }
}
