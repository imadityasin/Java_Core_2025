//Program: Store 5 Integers and Find Their Sum

package collection_framework.list.ArrayList;

import java.util.ArrayList;

public class Program_05 {
    public static void main(String[] args) {
//        Created a ArrayList.
        ArrayList <Integer> a1=new ArrayList<>();

//        Adding Numbers in ArrayList.
        a1.add(5);
        a1.add(56);
        a1.add(43);
        a1.add(56);
        a1.add(76);

        int sum=0;
        for (int i : a1) {
            sum=sum+i;
        }

        System.out.println("Sum = "+sum);
    }
}
