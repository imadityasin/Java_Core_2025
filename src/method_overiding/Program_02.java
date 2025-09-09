package method_overiding;

/*

    Exercise 3: Covariant return types
    Objective: Demonstrate that an overridden method can have a covariant return type (a more specific, or "narrower,"
               return type).
    Instructions:
    - Create a class Animal with a method getAnimal() that returns an Animal object.
    - Create a subclass Dog that extends Animal.
    - In the Dog class, override the getAnimal() method to return a Dog object instead.
    - In the main method, assign a new Dog object to an Animal reference, and then call getAnimal().
    - Confirm that the more specific Dog type is returned.

*/

class Animal{
    void getAnimal() {

    }
}

public class Program_02 {
    public static void main(String[] args) {

    }
}
