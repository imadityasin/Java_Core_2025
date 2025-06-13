//Check if an Element Exists in the List

package collection_framework.list.ArrayList;

import java.util.Scanner;

import java.util.ArrayList;

public class Program_03 {
    public static void main(String[] args) {
//        Scanner Class Object
        Scanner sc=new Scanner(System.in);

//        CREATED A ARRAYLIST.
        ArrayList <String> cities=new ArrayList<>();

//        Adding values
        cities.add("New Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Lahore (Soon to be indian state");

        System.out.println("Enter City Name : ");
        String city=sc.nextLine();

//        Searching an element with the help of loop and contains method
        if (cities.contains(city)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
