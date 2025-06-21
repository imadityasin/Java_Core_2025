/*
Write a Java program to create a class called Rectangle with private instance variables length and width.
 Provide public getter and setter methods to access and modify these variables.
*/

package oops.encapsulation;

import java.util.Scanner;

class Rectangle{
    private int length;
    private int width;

    public void setLength(int length) {
        this.length=length;
    }

    public void setWidth(int width) {
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int areaOfRectangle() {
        int area=length*width;
        return area;
    }

    public int perimeterOfRectangle() {
        int perimeter=2*(length*width);
        return perimeter;
    }

}

public class Program_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rec=new Rectangle();

        System.out.println("Enter Length");
        int length=sc.nextInt();
        rec.setLength(length);
        System.out.println("Enter Width");
        int width=sc.nextInt();
        rec.setWidth(width);

        System.out.println("length is = "+rec.getLength());
        System.out.println("Width is = "+rec.getWidth());
        System.out.println("Area Of Rectangle is = "+rec.areaOfRectangle());
        System.out.println("Perimeter of Rectangle is = "+rec.perimeterOfRectangle());
    }
}
