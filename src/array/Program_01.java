package array;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        //Array
        int[] mocknum = new int[3];

        //if we want to store the data in array we have to use loop.
        for (int i = 0; i < mocknum.length; i++) {
            System.out.println("Enter Marks in Java Mock Number " + (i + 1) + ": ");
            mocknum[i] = sc.nextInt();
        }

        //if we want to access the data of array we have to use loop.
        System.out.println("Marks entered are:");
        for (int i = 0; i < mocknum.length; i++) {
            System.out.println("Mock " + (i + 1) + ": " + mocknum[i]);
        }
//        Always we have to close Scanner object for releasing the data
        sc.close();
    }
}
