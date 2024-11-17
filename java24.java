// Custom Exception for TooOlder
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

// Custom Exception for TooYounger
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class java24 {

    // Method to check candidate eligibility based on age
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate is too old for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Candidate is too young for recruitment.");
        } else {
            System.out.println("Eligible");
            System.out.println("Candidate Name: " + name);
        }
    }

    public static void main(String[] args) {
        // Example data for candidates
        String candidateName = "John Doe";
        int candidateAge = 22;

        try {
            checkEligibility(candidateName, candidateAge);
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
}

