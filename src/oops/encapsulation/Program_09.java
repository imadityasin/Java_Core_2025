/*
 Write a Java program to create a class called Person with private instance variables name, age. and country.
 Provide public getter and setter methods to access and modify these variables.
*/
package oops.encapsulation;

import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}

public class Program_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Important! Clear the newline character after nextInt()

        System.out.print("Enter your Country: ");
        String country = sc.nextLine();

        p.setName(name);
        p.setAge(age);
        p.setCountry(country);

        // Displaying the values using getters
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());

        sc.close();
    }
}
