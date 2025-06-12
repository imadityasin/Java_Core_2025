package oops.abstraction;

//IF THIS PROGRAM WE ARE USING INTERFACE FOR 100% ABSTRACTION.

//✔ Interface ✔ दोनों methods default तरीके से public abstract हैं (Java खुद मान लेता है)
interface Animall{
    void sound();
    void sleep();
}

// Dog class implements Animal interface
class Dogg implements Animall {
    public void sound() {
        System.out.println("Bow Bow...");
    }
    public void sleep() {
        System.out.println("Dog Sleep");
    }
}
public class Program_02 {
    public static void main(String[] args) {
        Dogg dgg=new Dogg();
        dgg.sound();
        dgg.sleep();
    }
}
