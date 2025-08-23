// NullPointerException – Most common bug.

package Exception_Handling;

public class NullPointerException {
    public static void main(String[] args) {
        String value=null;

        try {
            System.out.println(value.length());
        }
        catch (java.lang.NullPointerException e) {
            System.out.println("Exception Occurs and you are in catch block");
            System.out.println(e);
        }

    }

    public static class Try_with_multiple_catch {
    }
}
