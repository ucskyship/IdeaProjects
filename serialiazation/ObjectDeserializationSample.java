package serialiazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializationSample {
    static FileInputStream fileInputStream;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try ( ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("dog"))){
                Dog dog = (Dog) objectInputStream.readObject();
                System.out.println(dog);
            } catch(IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
}
    }
}
