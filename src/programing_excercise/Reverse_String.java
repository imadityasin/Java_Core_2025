// WAJP TO REVERSE THE STRING.
package programing_excercise;

public class Reverse_String {
    public static void main(String[] args) {
        String orignal="Aditya";
        String reversed="";

//        int i=orignal.length() iska matlab hai, i ki value orignal name string k length ke barabar hai.
//        i>=0 iska matlab hai i ya to 0 hojaye ya 0 se bda hojaye to loop ruk jayega
//        if we give -1 after length() then loop will start from end to start.
//        charAt(i) String ka i-th number wala letter laao
        for(int i=orignal.length()-1;i>=0;i--) {
            reversed += orignal.charAt(i);
        }

        System.out.println("Reversed String is = "+reversed);
    }
}
