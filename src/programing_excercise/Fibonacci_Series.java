//Fibonacci Series.


package programing_excercise;

public class Fibonacci_Series {
    public static void main(String[] args) {
//        Fibonacci series always have 0 and 1 because in this series Har next number = Pichle 2 numbers ka sum.
//        like this 0, 1, 1, 2, 3, 5, 8, 13, 21, ....

//         Step 1: Declare two numbers 0 and 1.
        int first=1;
        int second=2;

//        Step 2: Print Them.
        System.out.println(first+""+second);

//        Loop to calculate the next numbers.
        for(int i=0;i<=8;i++) {
            int next=first+second;      //Sum of previous two.
            System.out.println("" + next);

            // Step 4: Shift the numbers forward
            first = second;
            second = next;
        }
    }
}
