public class mod5e7 {
    public static void main(String[] args) {
        double totalCost = 0;      // Accumulate total cost of four years tuition
        double tuition = 10000;
        double tuitionTenthYear = 0; // Initialize to 0 to avoid compilation error

        for (int year = 1; year <= 14; year++) {
            // Increase tuition by 5% every year
            tuition += (tuition * 0.05);

            if (year > 10) // After 10 years, accumulate tuition cost
                totalCost += tuition;

            // Cost of tuition in the tenth year
            if (year == 10)
                tuitionTenthYear = tuition;
        }

        // Display the cost of tuition in ten years
        System.out.printf("Tuition in ten years: $%.2f%n", tuitionTenthYear);

        // Display the cost of four years' worth of tuition after the tenth year
        System.out.printf("Total cost for four years' worth of tuition after the tenth year: $%.2f%n", totalCost);
    }
}