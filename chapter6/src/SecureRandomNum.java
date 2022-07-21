import java.security.SecureRandom;

public class SecureRandomNum {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        for (int count = 1; count <= 20 ; count++) {
            int face = 1 + random.nextInt(6);

            System.out.printf("%d ", face);

            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}