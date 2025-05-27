//Encapsulation.

//1. Basic Student Info (Beginner)
//Create a class Student with the following private fields:
//
//name, age, rollNumber
//Add public getter and setter methods for each.
//Then create a main class to set and display the values.

package oops.encapsulation;

import java.util.Scanner;

class Student{
        private String name;
        private int age;
        private long rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getRollNumber() {
        return rollNumber;
    }
}

public class Program_01 {
    public static void main(String[] args) {
//        Student class Object for calling methods
        Student st=new Student();

//        Scanner class object for Taking user input
        Scanner sc=new Scanner(System.in);

//        Taking details from user and strroing then passing
        System.out.println("Enter Name : ");
        String name=sc.nextLine();
        st.setName(name);

        System.out.println("Enter Age : ");
        int Age=sc.nextInt();
        st.setAge(Age);

        System.out.println("Enter Roll Number");
        long rollNumber= sc.nextLong();
        st.setRollNumber(rollNumber);

//        Displaying Details
        System.out.println("Name : "+st.getName());
        System.out.println("Age : "+st.getAge());
        System.out.println("Roll Number : "+st.getRollNumber());
    }
}
