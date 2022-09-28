package chapter15;

import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\dell\\JAVA WORKS\\src\\chapter15\\test.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String sentence = reader.readLine();
            System.out.println(sentence);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
