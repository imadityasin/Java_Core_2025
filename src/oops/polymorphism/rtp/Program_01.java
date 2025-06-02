//METHOD OVERRIDING (RUN TIME POLYMORPHISM)

//Create a base class Vehicle with a method run().
//Create two child classes: Bike and Car.
//Override the run() method in both child classes to print their own messages.
//
//Then, in the main method, create a Vehicle reference and assign it objects of Bike and Car one by one.
//Call the run() method each time.

package oops.polymorphism.rtp;

class Vehicle{
    void run() {
        System.out.println("Hello I'm Vehicle ");
    }
}

class bike extends Vehicle{
    @Override
    void run() {
        System.out.println("Hello, I'm Bike ");
    }
}

class car extends Vehicle{
    @Override
    void run() {
        System.out.println("Hello, I'm Car ");
    }
}

public class Program_01 {
    public static void main(String[] args) {
        Vehicle vh=new Vehicle();

        vh.run();       // Output: Hello I'm Vehicle

        vh = new bike();      //Upcasting
        vh.run();       // Output: Hello, I'm Bike

        vh = new car();      //Upcasting
        vh.run();       // Output: Hello, I'm Car
    }
}
