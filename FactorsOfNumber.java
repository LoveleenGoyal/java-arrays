import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input fo a number
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// Initial size of the factor array
		int maxFactor = 10;
		// Array to store factors
		int[] factors = new int[maxFactor];
		// Index for storing factors
		int index = 0;
		
		// Use for loop to find the factors
		for( int i = 1 ; i <= number ; i++) {
			if (number % i == 0) {
				// Check if array need to resized or not
				if (index == maxFactor) {
					// Make the array size double 
					maxFactor *= 2;
					// Temporary array
					int[] temp = new int[maxFactor];
					// Storing the elements from factor array to temp array
					for (int j = 0 ; j < factors.length ; j++) {
						temp[j] = factors[j];
					}
					// Assigning the factors array to temp array
					factors = temp;
				}
				// Storing factors
				factors[index] = i;
				// Increasing the index
				index++;
			}
		}
		
		// Display the results
		System.out.println("Factors of " + number + " are: ");
		for (int i = 0 ; i < index ; i++) {
			System.out.print(factors[i] + " ");
		}
		sc.close();
	}
}			