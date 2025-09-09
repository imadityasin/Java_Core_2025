package oops.encapsulation;

import java.util.Scanner;

class Student_01{
    private int studentId;
    private String studentName;

    public void setStudentId(int id) {
        this.studentId=id;
    }

    public void setStudentName(String name) {
        this.studentName=name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

}

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student_01 sc1=new Student_01();

        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        sc1.setStudentName(name);

        System.out.println("Enter Student ID");
        int id=sc.nextInt();
        sc1.setStudentId(id);

        System.out.println("Now in encapsulation after using private keyword we are " +
                "still accessing data members through getter and setter methods");

        System.out.println();

        System.out.println("Student name is : "+sc1.getStudentName());
        System.out.println("Student ID is : "+sc1.getStudentId());

    }
}
