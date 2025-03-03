import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking user input to store number
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// Defining an integer array to store results
		int[] table = new int[4];
		
		System.out.println("The multiplication table of " + number + " is: ");
		for(int i = 0 ; i < 4 ; i++) {
			// Store the result of multiplication in array
			table[i] = number * (i + 6);
			// Display the multiplication
			System.out.println(number + " * " + (i + 6) + " = " + table[i]);
		}
		sc.close();
	}
}
