import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Initializing the integer array 
		int[] numberArray = new int[5];
		
		// Taking user's input to store elements in array
		System.out.println("Enter the numbers in an array: ");
		for (int i = 0 ; i < numberArray.length ; i++) {
			numberArray[i] = sc.nextInt();
		}
		
		// Iterate over number array 
		for (int i = 0 ; i < numberArray.length ; i++) {
			// Check if the number is positive, zero, or negative 
			if (numberArray[i] > 0) {
				System.out.print("Positive ");
				if (numberArray[i] % 2 == 0) { // Check if number is odd or even
					System.out.println("The number " + numberArray[i] + " is an even number");
				} else {
					System.out.println("The number " + numberArray[i] + " is an odd number");
				}
			} else if (numberArray[i] == 0) {
				System.out.println("Zero");
			} else {
				System.out.println("Negative");
			}
		}
		
		// Comparing first and last element of an array 
		if (numberArray[0] > numberArray[numberArray.length - 1]) {
			System.out.print("First element is greater than last element");
		} else if (numberArray[0] == numberArray[numberArray.length - 1]) {
			System.out.print("First and last element are equal");
		} else {
			System.out.print("First element is lesser that last element");
		}
		sc.close();
	}
}