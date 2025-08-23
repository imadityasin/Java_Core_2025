/*
 FileNotFoundException
 File-related tasks.
*/
package Exception_Handling;

import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("Myfile.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File Not Found");
            throw new RuntimeException(e);
        }
    }
}
