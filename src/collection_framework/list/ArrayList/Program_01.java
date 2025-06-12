package collection_framework.list.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class Program_01 {
    public static void main(String[] args) {
//        Created a ArrayList.
        ArrayList<String> a1 = new ArrayList<String>();

//        add() method : adds the values you provide into arraylist
        a1.add("Inderjit Singh");
        a1.add("Usha Singh");
        a1.add("Rahul Singh");
        a1.add("Shilpa Singh");
        a1.add("Aditya Singh");

        System.out.println(a1);

//        It will add in last
        a1.add("Samanvitha Singh");
        System.out.println(a1);

//        It will add in the index 0.
        a1.add(0, "Late Shri. Awadh Bihari Singh");
        System.out.println(a1);

//        It will add in the index 1.
        a1.add(1, "Shail Kumari");
        System.out.println(a1);

//        It will add string in 5th element.
        a1.add(4, "Vladimir Putin");
        System.out.println(a1);

//        size(); method will print the size of ArrayList.
        System.out.println(a1.size());

//        remove() method : it will remove the particular element you pass.
        a1.remove(4);
        System.out.println(a1);

//        set() method : it will replace the element with another value.
        a1.set(6, "Babu");
        System.out.println(a1);

//        get() method: If you want to fetch particular arraylist element.
        System.out.println(a1.get(5));

        //        iterate/operations
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get( i )+" , ");
        }

        System.out.println();

//        clear() method : if you want to clear all the arraylist elements.
        a1.clear();
        System.out.println(a1);


    }
}
