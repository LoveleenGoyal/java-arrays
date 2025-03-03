import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input to store number
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// Defining an integer array to store results
		int[] table = new int[10];
		
		// Store the result of multiplication in array
		for (int i = 1 ; i <= 10 ; i++) {
			table[i - 1] = number * i;
		}
		
		// Display the multiplication table
		System.out.println("The multiplication table of " + number + " is: ");
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(number + " * " + (i + 1) + " = " + table[i]);
		}
		sc.close();
	}
}
			