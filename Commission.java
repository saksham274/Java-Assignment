import java.util.Scanner;

public class Commission {
    // Instance variable for sales
    private double sales;

    // Constructor to initialize the sales
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate and return the commission
    public double commission() {
        if (sales >= 0 && sales <= 1000) {
            return sales * 0.05; // 5% commission for sales up to 1000
        } else if (sales > 1000 && sales <= 5000) {
            return sales * 0.07; // 7% commission for sales between 1001 and 5000
        } else if (sales > 5000) {
            return sales * 0.10; // 10% commission for sales above 5000
        } else {
            return 0; // Invalid sales (negative)
        }
    }

    // Getter for sales
    public double getSales() {
        return sales;
    }
}