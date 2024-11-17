import java.util.HashMap;
import java.util.Map;

// Custom exception class
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CountryCapital {
    public static void main(String[] args) {
        // Ensure that the user provides a country name
        if (args.length != 1) {
            System.out.println("Please provide a country name.");
            return;
        }

        String country = args[0];
        
        // Create a map to store country-capital pairs
        Map<String, String> countryCapitalMap = new HashMap<>();
        
        // Populate the map with country-capital pairs
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Australia", "Canberra");
        countryCapitalMap.put("Japan", "Tokyo");

        try {
            // Check if the entered country is in the map
            if (countryCapitalMap.containsKey(country)) {
                // If found, print the capital
                System.out.println("The capital of " + country + " is " + countryCapitalMap.get(country));
            } else {
                // If not found, throw the custom exception
                throw new NoMatchFoundException("No match found for the country: " + country);
            }
        } catch (NoMatchFoundException e) {
            // Handle the exception and print the error message
            System.out.println(e.getMessage());
        }
    }
}