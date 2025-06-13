package collection_framework.list.ArrayList;

import java.util.ArrayList;

public class Program_02 {
    public static void main(String[] args) {
//        Creating ArrayList.
        ArrayList <Integer> al=new ArrayList<>();

//        Adding value in arraylist.
        al.add(2);
        al.add(4);
        al.add(6);

//        Accessing value of the ArrayList.
        System.out.println(al.get(2));

//        Updating the current value.Index number then comma then value to be updated.
        al.set(2, 78);
        System.out.println(al);

//        remove the value in the arraylist.
        al.remove(2);
        System.out.println(al);

//        find size of arraylist.
        System.out.println(al.size());

//        clear: removes all the elements in the arraylist.
        al.clear();
        System.out.println(al);

//        contains: check value is present in arraylist or not.
        System.out.println(al.contains(2));

//        isEmpty: checks array is empty or not.
        System.out.println(al.isEmpty());

    }
}
