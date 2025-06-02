//METHOD OVERRIDING (RUN TIME POLYMORPHISM)

//Create a base class called Shape with a method draw().
//Then, create three subclasses: Circle, Rectangle, and Triangle.
//Each subclass should override the draw() method and print its own message.
//
//In the main() method, use a Shape reference and assign it to objects of all three subclasses one by one.
//Call the draw() method each time.

package oops.polymorphism.rtp;

class Shape{
    void draw() {
        System.out.println("This is Shape class");
    }
}

class Circle extends Shape{
    void draw() {
        System.out.println("This is Circle class");
    }
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("This is Rectangle class");
    }
}

class Triangle extends Shape{
    void draw() {
        System.out.println("This is Triangle class");
    }
}

public class Program_02 {
    public static void main(String[] args) {
        Shape sp=new Shape();
        sp.draw();

        sp =new Circle();
        sp.draw();
        sp=new Rectangle();
        sp.draw();
        sp=new Triangle();
        sp.draw();
    }
}
