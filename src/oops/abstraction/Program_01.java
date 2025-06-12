package oops.abstraction;

//we can achieve partial abstraction through abstract modifier
//if you want to achieve 100% abstraction you have to use interface for that.
abstract class Animal{
    abstract void sound();

    void sleep() {
        System.out.println("Animal");
    }
}

class Dog extends Animal{
    // Overriding sound method and providing implementation.
    void sound() {
        System.out.println("Bow Bow...!!!");
    }
}

public class Program_01 {
    public static void main(String[] args) {
//        we cant create abstract class object = Animal al=new Animal(); ❌

        Dog dg=new Dog();
        dg.sound();
        dg.sleep();
    }
}
