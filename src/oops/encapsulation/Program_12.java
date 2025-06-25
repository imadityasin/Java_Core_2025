/*
Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify the id and name variables,
but provide a getter method for the salary variable that returns a formatted string.
*/

package oops.encapsulation;

import java.util.Scanner;

class Employee {
    private int employee_id;
    private String employee_name;
    private double salary;

    public void setEmployee_id(int empid) {
        this.employee_id = empid;
    }

    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getFormattedSalary() {
        return null;
    }
}

public class Program_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        // Taking Input from User.
        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Employee Name: ");
        String empname = sc.nextLine();

        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        // Setting values
        emp.setEmployee_id(empid);
        emp.setEmployeeName(empname);
        emp.setSalary(sal);

        // Displaying output
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + emp.getEmployee_id());
        System.out.println("Employee Name: " + emp.getEmployee_name());
        System.out.println("Employee Salary: " + emp.getFormattedSalary());

        sc.close();
    }
}
