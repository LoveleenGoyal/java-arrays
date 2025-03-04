import java.util.Scanner;

public class LargestAndSecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int maxDigit = 10;
		int[] digits = new int[maxDigit];
		int index = 0;
		
		// Extract digits of number and store in array
		while (number > 0 && index < maxDigit) {
			digits[index] = number % 10; // get last digit
			index++;
			number /= 10; // remove last digit
		}
		
		if (index == 0) {
			System.out.println("No Digits found");
			return;
		}
		
		// Initialize largest and second largest digit
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0 ; i < index ; i++) {
			if (digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} else if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
		
		// Display the results
		System.out.println("Largest Digit: " + largest);
		System.out.println("Second Largest Digit: " + secondLargest);
		sc.close();
	}
}