import java.util.stream.IntStream;

public class Filter {
    public static void main(String[] args) {
//        Human human = () -> System.out.println("I'm a princess");
//        human.speak();
        System.out.println(IntStream.rangeClosed(1,10)
                .filter((x) -> x%2 == 0)
                .map((y)->y*3)
                .sum()
        );
    }
}
