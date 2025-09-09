/*
    Q1. Person → Employee (Single Inheritance)
        Person class banao (name, age).
        Employee class banao jo Person se inherit kare (empId, salary).
        Dono classes ka data print karo.
*/

package oops.inheritance.All_Types;

class Person1{
    String name;
    int age;
}

class Employee extends Person1{
    int empId=1;
    double salary=1875035.76;
}

public class Single_Level_Inheritance {
    public static void main(String[] args) {
        Employee em=new Employee();
        System.out.println("Name is = "+em.name);
        System.out.println("Age is = "+em.age);
        System.out.println("Emp ID is = "+em.empId);
        System.out.println("Salary is = "+em.salary);
    }
}
