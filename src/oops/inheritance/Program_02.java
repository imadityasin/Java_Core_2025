// Single Level Inheritance.

//Create a class Vehicle with a field brand and method displayBrand().
//Inherit it in class Car with an additional field model and method displayCarDetails().

package oops.inheritance;

import java.util.Scanner;

class Vehicle{
    String Brand;

    void displayBrand(String Brand) {
        this.Brand=Brand;
    }
}

class Car extends Vehicle{
    String Model;

    void displayingCardetails(String Model) {
        this.Model=Model;

        System.out.println("Brand Name : "+ Brand);
        System.out.println("Model Name : "+ Model);
    }
}

public class Program_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Car c1=new Car();

        System.out.println("Enter Brand Name : ");
        String Brand=sc.nextLine();
        c1.displayBrand(Brand);

        System.out.println("Enter Model Name : ");
        String Model=sc.nextLine();
        c1.displayingCardetails(Model);

    }
}
