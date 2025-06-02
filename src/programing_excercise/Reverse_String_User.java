//PROGRAM TO REVERSE STRING TAKING USER INPUT
package programing_excercise;

import java.util.Scanner;

public class Reverse_String_User {
    public static void main(String[] args) {
        System.out.println("PROGRAM TO REVERSE STRING TAKING USER INPUT");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Name");
        String original=sc.nextLine();

        String reversed=""; //Mandatory to initialize.

        for(int i=original.length()-1;i>=0;i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed String is = "+reversed);
    }
}
