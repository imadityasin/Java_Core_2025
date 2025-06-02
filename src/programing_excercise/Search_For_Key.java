// Write a program to search for key=5 in given num = 54619
package programing_excercise;

public class Search_For_Key {
    public static void main(String[] args) {
        int num = 54619;    //Given Value
        int key=5;          //Value we have to find


//        String numStr = String.valueOf(num); iska matlab num jo int h usko string m bdl do
//        found isliye bnaya ki value mile to yeh true hojaye.
        String numStr = String.valueOf(num);
        boolean found=false;

        for (int i=0;i<numStr.length();i++) {
            int digit = numStr.charAt(i) - '0';  // Convert char to int

            if(digit==key) {
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println(" Key "+key + " is found on " + num);
        }
        else {
            System.out.println("Key " + key + " is NOT found in " + num);
        }
    }
}
