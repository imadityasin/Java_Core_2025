//Problem:
//
//Create a Java class named Student that demonstrates encapsulation. The class should include the following:
//
//Private data members:
//
//name (String)
//
//rollNumber (int)
//
//marks (double)
//
//Public getter and setter methods for each field.
//
//A method displayDetails() that prints the student's details.
//
//Requirements:
//
//Ensure that marks cannot be set to a value less than 0 or more than 100.
//
//In the main() method, create an object of Student, set its details using setters, and then print them using displayDetails().

package oops.encapsulation;

import java.util.Scanner;

class Student1 {
    private String name;
    private int rollNumber;
    private double marks;

    // Setter methods with validation
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("❌ Invalid marks! Please enter a value between 0 and 100.");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    // Display method
    void displayDetails() {
        System.out.println("📚 Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Program_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student1 s1 = new Student1();

        System.out.println("🏫 K.R. MANGALAM UNIVERSITY");

        System.out.print("Enter Name: ");
        s1.setName(sc.nextLine());

        System.out.print("Enter Roll Number: ");
        s1.setRollNumber(sc.nextInt());

        System.out.print("Enter Marks: ");
        s1.setMarks(sc.nextDouble());

        System.out.println();
        s1.displayDetails();
    }
}
