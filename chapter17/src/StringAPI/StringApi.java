package StringAPI;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StringApi {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach((number) -> System.out.println(number));

        System.out.println("\nOr it can be written like this\n");

        Consumer<Integer> consumer = (number) -> System.out.println(number);
        numbers.forEach(consumer);

        System.out.println();

        numbers.stream().filter((number) -> number % 2 != 0).forEach(consumer);

        System.out.println();

        Map<Integer, String> map = Map.of(
                1, "Ucj",
                2, "Hizara",
                3, "John");
        BiConsumer<Integer, String> biConsumer = (age, surname) -> System.out.println(age + " " + surname);
        map.forEach(biConsumer);
//        the .of is an inbuilt method that takes in a list of key value pairs and returns a map
    }
}
