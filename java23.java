 // Custom Exception for TooHot
 class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// Custom Exception for TooCold
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class java23 {

    // Method to check the temperature
    public static void checkTemperature(int tempCelsius) throws TooHot, TooCold {
        if (tempCelsius > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (tempCelsius < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            System.out.println("Temperature is Normal.");
            double tempFahrenheit = (tempCelsius * 9.0 / 5.0) + 32;
            System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                // Convert the argument passed from command line to an integer
                int tempCelsius = Integer.parseInt(args[0]);
                checkTemperature(tempCelsius);
            } catch (TooHot e) {
                System.out.println(e.getMessage());
            } catch (TooCold e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer for temperature.");
            }
        } else {
            System.out.println("Please provide a temperature value.");
        }
    }
}

