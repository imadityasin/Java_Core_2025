// ArrayIndexOutOfBounds
// Invalid array index    =	arr[10] when arr.length = 5
package Exception_Handling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) throws InterruptedException {
        int[] arrVar=new int[5];

        for (int i=0;i<arrVar.length;i++) {
            System.out.println("Enter Number : "+ i);
            Scanner sc=new Scanner(System.in);
            arrVar[i]=sc.nextInt();
        }

        for (int i=0;i<arrVar.length;i++) {
            System.out.println("Number at "+i +" : "+arrVar[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        Thread.sleep(2000);

        try {
            System.out.println(arrVar[65]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no index that you entered thatswhy that is exception at ");
        }

    }
}
