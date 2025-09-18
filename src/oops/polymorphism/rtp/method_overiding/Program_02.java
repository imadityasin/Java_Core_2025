package oops.polymorphism.rtp.method_overiding;

/*

    Exercise : Runtime Polymorphism
    - Create a base class Shape with a method draw() that prints "Drawing a shape".
    - Create two subclasses Circle and Rectangle that override draw().
    - Circle → "Drawing a circle"
    - Rectangle → "Drawing a rectangle"

     In main, create a Shape reference that points to both Circle and Rectangle objects.
👉   Print outputs and check runtime polymorphism.

*/

class Shape{
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Program_02{
    public static void main(String[] args) {
        Shape sp=new Rectangle();   //Runtime Polymorphism.
        sp.draw();
        sp.draw();
    }
}