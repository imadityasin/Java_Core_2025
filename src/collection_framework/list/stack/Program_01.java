package collection_framework.list.stack;

import java.util.Stack;

public class Program_01 {
    public static void main(String[] args) {
        Stack<String> s1=new Stack<>();  //LIFO
//       push : it will add the element.
//                    you can also use add or remove, but you are working with stack please use push and pop.
        s1.push("Ankit");
        s1.push("Aditya");
        s1.push("Simran");
        s1.push("reeve");

        System.out.println(s1);

//        pop : it will delete the last element. LIFO(LAST IN FIRST OUT)
//              you can also use add or remove but you are working with stack please use push and pop.
        s1.pop();
        System.out.println(s1);

    }
}
