// Single Level Inheritance.

//Create a class Person with a field name and method showDetails().
//Inherit it in class Student with an additional field rollNo and method showStudent().
//Take input from the user.

package oops.inheritance;

import java.util.Scanner;

class Person{
    String name;

    void showDetails(String name) {
        this.name=name;
    }
}

class Student extends Person{
    int rollNo;

    void showStudents(int rollNo) {
        this.rollNo=rollNo;

        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }
}

public class Program_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student s1=new Student();

        System.out.println("Enter Student Name : ");
        String Name=sc.nextLine();

        System.out.println("Enter Student Roll No : ");
        int rollNo=sc.nextInt();

        s1.showDetails(Name);
        s1.showStudents(rollNo);
    }
}
