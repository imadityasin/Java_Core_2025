/*
Multi-Level Inheritance
    Person → Employee → Manager
    Manager ke paas departmentName aur teamSize ho.
    Sab ke details print karo.
*/

package oops.inheritance.All_Types;

class Person2{
    String address="WZ 3100";
    long mobile=965062300;
}

class Employee2 extends Person2{
    String emp_name="Aditya Singh";
    String organization_name="Accenture";
}

class Manager2 extends Employee2{
    String Department_Name="tigers_Valley";
    int Team_size=49;
}

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        Manager2 mn=new Manager2();

        System.out.println("Name is = "+ mn.emp_name);
        System.out.println("Organization Name is = "+ mn.organization_name);
        System.out.println("Address is = "+ mn.address);
        System.out.println("Mobile Number is = " +mn.mobile);
        System.out.println("Team Size is = "+ mn.Team_size);
        System.out.println("Department Name = "+ mn.Department_Name);
    }
}
