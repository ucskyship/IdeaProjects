public class FunctionalInterfaceSample {
    public static void main(String[] args) {
//        Staff staff = (hours) ->
//            System.out.println("Working for " + hours + " hours a day");
//        staff.work(8);
//    }

//    OR when you want to implement more statements using the lambda
        Staff staff = hours -> overTime(hours);
        staff.work(8);
    }
        private static void overTime(int hours) {
            System.out.println("Working for " + hours + " hours a day");
        }
}
