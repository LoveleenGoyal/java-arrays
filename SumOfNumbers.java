import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of max 10 elements
        double[] numbers = new double[10];
        double totalSum = 0.0; 
		// Index to track array position
        int index = 0; 

        // Infinite while loop to take user input
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Check if the number is 0 or negative
            if (num <= 0) {
                break;
            }
            // Store number in array if index < 10
            if (index < 10) {
                numbers[index] = num;
                index++; 
            } else {
                break; 
            }
        }

        // Display numbers and calculate sum
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            totalSum += numbers[i]; 
        }

        // Display the total sum
        System.out.println("\nSum of all numbers: " + totalSum);

        sc.close();
    }
}

