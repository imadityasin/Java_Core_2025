package oops.polymorphism.rtp.method_overiding;

/*
Objective: Demonstrate method overriding and runtime polymorphism.

Instructions:
   - Create a base class Animal with method makeSound().
   - Create a subclass Dog and override makeSound().
   - Show difference between:
        1. Dog reference + Dog object (No polymorphism)
        2. Animal reference + Dog object (Runtime polymorphism)
*/

class Animal {
    // ✅ Base class method
    void makeSound() {
        System.out.println("The animal makes a sound");
    }

    // ✅ Normal method (not overridden in Dog)
    void makS() {
        System.out.println("Addiii");
    }
}

class Dog extends Animal {
    // ✅ Overriding the makeSound() method of Animal
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }

    // ✅ Dog class ka apna method (Not present in Animal)
    void fetch() {
        System.out.println("Aditya Singh");
    }
}

public class Program_01 {
    public static void main(String[] args) {

        // 🔹 Case 1: Dog reference + Dog object
        // ✅ Normal object creation (No polymorphism, direct method call)
        Dog dg = new Dog();
        dg.makeSound();  // Output: The dog barks (Overridden method)
        dg.fetch();      // Output: Aditya Singh (Dog specific method)

        System.out.println("--------------");

        // 🔹 Case 2: Animal reference + Dog object
        // ✅ Runtime Polymorphism (Reference type is Animal but object is Dog)
        Animal an = new Dog();

        // Runtime me Dog ka makeSound() call hoga (Dynamic Method Dispatch)
        an.makeSound();  // Output: The dog barks ✅ (Overridden method is called)

        // ✅ Animal class ka normal method bhi accessible hai
        an.makS();       // Output: Addiii

        // ❌ Not allowed: an.fetch();
        // Kyunki fetch() method Animal class me declare hi nahi hai
    }
}
