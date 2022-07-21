import java.util.Scanner;

public class MaximumFinder{
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.println("Enter three different double number separated with spaces: ");

        double number1 = value.nextDouble();
        double number2 = value.nextDouble();
        double number3 = value.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("The maximum number is: " + result);
    }

    private static double maximum(double x, double y, double z) {
//        // assume a variable to have the maximum value
//        double maximumValue = z;
//        if(x > maximumValue){
//            maximumValue = x;
//        }
//        if (y > maximumValue) {
//            maximumValue = y;
//        }
//        return maximumValue;

//        OR

        return Math.max(x, Math.max(y, z));
    }
}