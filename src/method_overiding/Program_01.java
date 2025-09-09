package method_overiding;

/*

    Exercise 2: Using the super keyword
    Objective: Show how to call a superclass's overridden method from the subclass using super.
    Instructions:
    - Create a class Vehicle with a speedUp() method that prints "Vehicle speed is increasing."
    - Create a class Car that extends Vehicle.
    - Override the speedUp() method in the Car class.
    - Inside the overridden method in Car, use super.speedUp() to call the parent's method first.
    - After the super call, add a line that prints "Car is accelerating."
    - In the main method, create a Car object and call the speedUp() method.

*/

class Vehicle{
    void speedUp() {
        System.out.println("Vehicle speed is increasing.");
    }
}

class Car extends Vehicle{
    void speedUp() {
        super.speedUp();
        System.out.println("Car is accelerating.");
    }
}

public class Program_01 {
    public static void main(String[] args) {
        Car cr= new Car();
        cr.speedUp();
    }
}
