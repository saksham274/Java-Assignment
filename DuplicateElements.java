import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store n elements
        int[] numbers = new int[n];

        // Input: Read the elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find and display duplicates and their frequency
        findDuplicates(numbers);
    }

    // Method to find duplicate elements and their frequency
    public static void findDuplicates(int[] numbers) {
        // Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the duplicate elements and their frequency
        System.out.println("Duplicate elements and their frequency:");
        boolean found = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}

