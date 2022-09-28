import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollection {
    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        //create and display a list containing the suit array elements
        List<String> suitList = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n",  suitList);

        Collections.sort(suitList);
        System.out.printf("Sorted array elements: %s%n", suitList);
    }
}
