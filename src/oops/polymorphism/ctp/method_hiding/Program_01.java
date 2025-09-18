package oops.polymorphism.ctp.method_hiding;

/*

    Exercise 3: Method Hiding vs Overriding
                Create class Parent with a static void display() method.
                Create class Child that defines static void display() with different message.

                In main, do:
                    Parent p = new Child();
                    p.display();

                👉 Observe output and compare with overriding.

*/

class Parent {
    static void display() {
        System.out.println("Hello Display");
    }
}

class Child extends Parent{
    static void display() {
        System.out.println("Hello Different display");
    }
}

public class Program_01 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();

/*        ये वाला example तुमने सही लिखा है, लेकिन इसमें runtime polymorphism नहीं हो रहा।
        👉 Reason:
        static methods inherit तो होते हैं लेकिन override नहीं होते।
        जब Child class भी static display() लिखती है, तो इसे method overriding नहीं,
        बल्कि method hiding कहा जाता है।
        Compile time पर ही decide हो जाता है कि कौन सा method call होगा, reference type के हिसाब से।
*/
    }
}
