package exercise;

public class GasMileage {

    private double allMMileDriven;
    private int allMMilesPerGallon;

    public double allMilesDriven() {
        double total = 0;
        return total = allMMileDriven/allMMilesPerGallon;
    }

    public double getAllMMileDriven(){
        return allMMileDriven;
    }
    public double getAllGallonPerMiles(){
        return allMMilesPerGallon;
    }

    public double totalMilesPerGallon(double milesDriven, int gallons) {
       double mpg = 0;
        allMMileDriven = allMMileDriven + milesDriven;
        allMMilesPerGallon = allMMilesPerGallon + gallons;
       return mpg = milesDriven / gallons;
    }

    public void allGallonPerMiles() {

    }
}
