import java.util.Scanner;

public class mod6e5{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Display numbers in increasing order
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(
        double num1, double num2, double num3) {
        
        double temp; // Hold number to swap

        // Ensure num1 is the smallest
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        
        // Ensure num2 is the middle
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display result
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}