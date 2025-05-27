//Hierarchical Inheritance.

//Exercise 1: Simple Hierarchical Structure
//Goal: Create a base class Animal, and two child classes Dog and Cat.
//
//Requirements:
//
//Animal has method: makeSound()
//
//Dog prints: "Dog barks"
//
//Cat prints: "Cat meows"

package inheritance;

class Animal1{
    void makeSound() {

    }
}

class Dog1 extends Animal{
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal1{
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Program_11 {
    public static void main(String[] args) {
        Dog1 dg=new Dog1();
        dg.makeSound();

        Cat ct=new Cat();
        ct.makeSound();
    }
}