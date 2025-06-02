package oops.encapsulation;

class Student{
    private String name="Aditya Singh";

    public String getName() {
        return name;
    }
}

public class Program_06 {
    public static void main(String[] args) {
        Student st=new Student();

        System.out.println("Your Name is = "+st.getName());

    }
}
