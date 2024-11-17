class Distance {
    protected double miles;

    public Distance(double m) {
        miles = m;
    }

    public void travelTime() {
        double hours = miles / 60;
        System.out.println("Time taken at 60 mph: " + hours + " hours");
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double kilometers) {
        super(kilometers * 0.621371); // Convert kilometers to miles
    }

  //  @Override
    public void travelTime() {
        double seconds = miles / 0.621371 / 100;
        System.out.println("Time taken at 100 km/s: " + seconds + " seconds");
    }
}

public class java12 {
    public static void main(String[] args) {
        Distance distance = new Distance(100);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(100);
        distanceMKS.travelTime();
    }
}

