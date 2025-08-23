package Exception_Handling.throws_;

public class Program_01 {
    public static void main(String[] args) throws InterruptedException {
        sleeped();
    }

    public static void sleeped() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("I am sleeping");
    }
}
