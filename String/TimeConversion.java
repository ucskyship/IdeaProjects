package String;

public class TimeConversion {
    private static String meridianComponent;

    public static void main(String[] args) {
        String time = "02:45:36";
        String _24HourTime = timeConverter(time);
        System.out.println(_24HourTime);
    }

    private static String timeConverter(String time) {
        String[] components = time.split(":");
        String hourComponent = components[0];
        String minuteComponent = components[1];
        String secondsMeridian = components[2];
        String secondsComponent = components[3];

        String MySecondsComponent = secondsMeridian.substring(0, 2);
        String secondsMeridan = secondsMeridian.substring(2);

        if (meridianComponent.equalsIgnoreCase("AM")){
             if (hourComponent.equals("12")){
                 hourComponent = "00";
             }
         } else if (meridianComponent.equalsIgnoreCase("PM")) {
             int hourComponentAsInt = Integer.parseInt(hourComponent);
             if (hourComponentAsInt < 12){
                 hourComponentAsInt = hourComponentAsInt + 12;
             }
             hourComponent = String.valueOf(hourComponentAsInt);
         }
         return hourComponent+":"+minuteComponent+":"+secondsComponent;
    }
}

