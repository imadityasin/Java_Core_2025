/*
            Hierarchical Inheritance
Person se Student aur Teacher dono inherit Karen.
Student ke paas rollNo, grade aur Teacher ke paas subject, salary.
*/

package oops.inheritance.All_Types;

class Person5{
    public Person5() {
        System.out.println("Hierarchical Inheritance");
    }
}

class Student extends Person5{
    int roll_no;
    Character grade;

}

class Teacher extends Person5{
    String subject;
    double salary;
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Student st=new Student();
        Teacher tr=new Teacher();

        System.out.println(st.roll_no);
    }
}
