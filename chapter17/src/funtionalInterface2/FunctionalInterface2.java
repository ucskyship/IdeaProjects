package funtionalInterface2;

import javax.swing.*;
import java.io.FilenameFilter;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterface2 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number) -> System.out.println(number);
        consumer.accept(10);
//        the consumer takes one parameter and consumes it

        BiConsumer<String, String> biConsumer = (name, surname) -> System.out.println(name + " " + surname);
        biConsumer.accept("John", "Doe");
//        this take 2 different types of parameter like String and Integer and consumes it

        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt();
        System.out.println(supplier.get());

        Predicate<String> predicate = (name) -> name.equals("Ucj");
        System.out.println(predicate.test("Hizara"));

        BiPredicate<Integer, String> biPredicate = (age, name) -> String.valueOf(age).equals(name);
        System.out.println(biPredicate.test(5, "Ucj"));

        Function<String, String> func = (word) -> String.valueOf(word.length());
        System.out.println(func.apply("Hello"));

        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> String.valueOf(num1*num2);
        System.out.println(biFunction.apply(2 , 4));

        UnaryOperator<Integer> unaryOperator = (number) -> number*number*number;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (num1, num2) -> (num1*num2);
        System.out.println(binaryOperator.apply(2, 5));
    }
}
