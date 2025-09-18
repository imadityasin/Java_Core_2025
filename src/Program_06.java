/*
    Exercise 5: Polymorphism Limitation
    Create class Animal with method sound().
    Create class Dog that overrides sound() and also has its own method fetch().

    In main, use:
        Animal a = new Dog();
        a.sound();
        a.fetch();  // kya hoga?

    👉 Figure out compile vs runtime behavior.
*/

class Animal{
    void sound() {
        System.out.println("Hello Sound");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("Hello Adi");
    }

    void fetch() {
        System.out.println("Fetch");
    }
}

public class Program_06 {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
}
