import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declare an array of integer elements
		int[] studentAge = new int[10];
		
		// Taking user input for student's age
		System.out.println("Enter the students age in an array: ");
		for (int i = 0 ; i < studentAge.length ; i++) {
			studentAge[i] = sc.nextInt();
		}
		
		// Iterating over students age using for loop
		for (int i = 0 ; i < studentAge.length ; i++) {
			// Check if age is negative number 
			if (studentAge[i] < 0) {
				System.err.println("Invalid age");
			} else {
				if (studentAge[i] >= 18) { // Check if age is above 18 or not
					System.out.println("The student with the age " + studentAge[i] + " can vote.");
				} else {
					System.out.println("The student with the age " + studentAge[i] + " cannot vote.");
				}
			}
		}
		sc.close();
	}
}
			
