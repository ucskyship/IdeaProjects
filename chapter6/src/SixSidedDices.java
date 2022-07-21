import java.security.SecureRandom;

public class SixSidedDices {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int count = 1; count <= 60_000_000 ; count++) {
            int face = 1 + random.nextInt(6);

            switch (face) {
                case 1 -> ++frequency1;
                case 2 -> ++frequency2;
                case 3 -> ++frequency3;
                case 4 -> ++frequency4;
                case 5 -> ++frequency5;
                case 6 -> ++frequency6;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d\n2\t\t%d\n3\t\t%d\n4\t\t%d\n5\t\t%d\n6\t\t%d\n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
    }
}