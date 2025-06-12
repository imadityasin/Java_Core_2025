package collection_framework.list.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Program_01 {
    public static void main(String[] args) {
//        Created a Linked List.
        LinkedList<String> linkedlist  = new LinkedList<String>();

//        add data in linked list
        linkedlist.add("Hy");
        linkedlist.add("6");
        linkedlist.add("78");
        linkedlist.add("Aditya");
        linkedlist.add("fuze");

        System.out.println(linkedlist);

//         addFirst: add in first element.
        linkedlist.addFirst("aditya");
        System.out.println(linkedlist);

//        addLast: add in last element.
        linkedlist.addLast("Sin");
        System.out.println(linkedlist);

//        add: add in specific element.
        linkedlist.add(3,"namah shivaya");
        System.out.println(linkedlist);

//        size(): to get size.
        System.out.println(linkedlist.size());

//        it removes the specific index.
        linkedlist.remove(7);

//        It removes the first element.
        linkedlist.removeFirst();
        System.out.println(linkedlist);

//        It removes the last element.
        linkedlist.removeLast();
        System.out.println(linkedlist);

        for(String str:linkedlist) {
            System.out.println(str);
        }
    }
}
