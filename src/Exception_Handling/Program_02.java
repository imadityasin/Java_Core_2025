// What is the role of the finally block? Give one use case.
//        (Theory + Code)
//    THE FINALLY BLOCK WILL ALWAYS EXECUTE WEATHER THE EXCEPTION IS OCCURRING OR NOT.
package Exception_Handling;

public class Program_02 {
    public static void main(String[] args) {
        double a=10780;
        double b=58;

        try{
            double result=a/b;
            System.out.println("Result is = "+result);
        } catch (Exception e) {
            System.out.println("Arithmetic Exception occurs");
        }
        finally {
            System.out.println("THIS FINALLY BLOCK WILL ALWAYS EXECUTE EXCEPTION WILL OCCURS OR NOT");
        }
    }
}
