import java.util.Scanner;

public class OddAndEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking user input to store number
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// Check if the number is natural number or not
		if (number < 1) {
			System.err.println(number + " is not a natural number");
			System.exit(0);
		} 
		
		// Initializing an inetger array for odd and even numbers
		int size = number / 2 + 1;
		int[] oddArray = new int[size];
		int[] evenArray = new int[size];
		
		int oddIndex = 0;
		int evenIndex = 0;
		// Loop from 1 to number to separate odd and even numbers
		for (int i = 1 ; i <= number ; i++) {
			if(i % 2 == 0){
				// Store even numbers
				evenArray[evenIndex] = i;
				evenIndex++;
			} else {
				// Store odd numbers
				oddArray[oddIndex] = i;
				oddIndex++;
			}
		}
		// Display the results
		System.out.print("Even numbers: ");
		for (int i = 0; i < evenIndex ; i++) {
			System.out.print(evenArray[i] + " ");
		}
		System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }
		sc.close();
	}
}
			