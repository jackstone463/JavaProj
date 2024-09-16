import java.util.Scanner;

public class GratuityCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the subtotal
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        // Prompt the user to enter the gratuity rate
        System.out.print("Enter the gratuity rate (as a percentage): ");
        double gratuityRate = input.nextDouble();

        // Calculate the gratuity
        double gratuity = subtotal * (gratuityRate / 100);

        // Calculate the total
        double total = subtotal + gratuity;

        // Display the results
        System.out.printf("Gratuity: $%.2f%n", gratuity);
        System.out.printf("Total: $%.2f%n", total);
    }
}