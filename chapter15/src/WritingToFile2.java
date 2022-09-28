package chapter15;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFile2 {
    public static void main(String[] args) {
        //writing to file
        try (PrintWriter writer =
                     new PrintWriter("C:\\Users\\dell\\JAVA WORKS\\src\\chapter15\\test.txt")){
            writer.println("Oma is a princess");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
