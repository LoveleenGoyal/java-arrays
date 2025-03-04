import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for a number
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// Total count of digits in number
		int temp = number;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		
		// Storing the digits of number in array
		int[] digits = new int[count];
		temp = number;
		for (int i = count - 1; i >= 0; i--) {
			digits[i] = temp % 10;
			temp /= 10;
		}
		
		// Initialize an array to store the elements in reverse order
		int[] reverse = new int[count];
		for (int i = 0; i < count; i++) {
			reverse[i] = digits[count - 1 - i];
		}
		
		// Printing the elements in reverse order
		System.out.print("Reversed number: ");
		for (int i = 0; i < count; i++) {
			System.out.print(reverse[i]);
		}
		sc.close();
	}
}