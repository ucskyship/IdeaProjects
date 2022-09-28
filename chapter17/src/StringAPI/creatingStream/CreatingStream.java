package StringAPI.creatingStream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        System.out.println("Ways of creating a Finite Stream");

        Stream<Integer> numbers = Stream.empty();

        System.out.println("\n OR \n");

        Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("\n To create and infinite stream \n");

        Supplier<Integer> supplier = () -> new Random().nextInt();
        Stream<Integer> numberList = Stream.generate(supplier);
        numberList.forEach((number) -> System.out.println(number));

        UnaryOperator<Character> unaryOperator = (character) -> ++character;
        Stream<Character> badCharacters = Stream.iterate('a', unaryOperator);
//                .limit(26);
//        the limit method is used to limit the number of elements in the stream
//                .skip(5);
//        the skip method is used to skip a number of elements in the stream
//                .filter((character) -> character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u');
//        the filter method is used to filter out elements in the stream
    }
//    private static
}
