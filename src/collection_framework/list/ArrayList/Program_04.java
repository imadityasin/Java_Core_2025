//Program: Copy One ArrayList into Another

package collection_framework.list.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program_04 {
    public static void main(String[] args) {
//        Created a ArrayList
        ArrayList <Integer> n1=new ArrayList<>();

//        Adding array in arrayList.
        n1.add(89);
        n1.add(50);
        n1.add(45);
        n1.add(35);
        n1.add(67);
        n1.add(21);
        n1.add(4565);

//        Sorting values in Ascending order.
        Collections.sort(n1);

        System.out.println(n1);
    }
}
