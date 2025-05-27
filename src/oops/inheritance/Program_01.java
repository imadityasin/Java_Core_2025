//Single - level Inheritance.
package oops.inheritance;
class Animal{
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Dog extends Animal{
    void sound() {
        super.sound();	//super calls parent class
        System.out.println("Baw Baw");
    }
}

public class Program_01 {
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.sound();
    }
}
