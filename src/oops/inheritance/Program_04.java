//Single Level Inheritance

//Create a parent class Shape with a method display().
//Create a child class Rectangle that inherits from Shape and includes:
//
//Fields: length, breadth
//
//Method: area() → calculates and displays area.
package oops.inheritance;

class Shape{
    void display() {
        System.out.println("This is a rectangle shape.");
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    void setDimensions(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    void area() {
        int area=length*breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Program_04 {
    public static void main(String[] args) {
//		Creating class object
        Rectangle rec=new Rectangle();

//		Calling methods using class objects
        rec.display();
        rec.setDimensions(56, 89);
        rec.area();
    }
}
