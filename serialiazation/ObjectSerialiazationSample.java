package serialiazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialiazationSample {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby", 10);
        try (ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("dog"))){
            out.writeObject(dog);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
