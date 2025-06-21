//Program: Remove All Even Numbers from the List

package collection_framework.list.ArrayList;

//Imported ArrayList for use (Compulsory)
import java.util.ArrayList;

public class Program_06 {
    public static void main(String[] args) {
//        Created a ArrayList
        ArrayList <Integer> n1=new ArrayList<>();

//        Adding values in arraylist.
        n1.add(5);
        n1.add(2);
        n1.add(78);
        n1.add(23);
        n1.add(32);
        n1.add(783);
        n1.add(234);

        System.out.println(n1);

            n1.removeIf(n -> n%2==0); //Condition: if number is divisible by 2

        System.out.println("After Removing Even Numbers: "+n1);
    }
}
