import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Initailizing the array named heights
		double[] heights = new double[11];
		
		// Taking user input to store heights of players
		System.out.println("Enter the heights of players present in football team: ");
		for (int i = 0 ; i < heights.length ; i++) {
			heights[i] = sc.nextDouble();
		}
		
		// Calculation sum of all elements in an array
		double sum = 0;
		for (int i = 0 ; i < heights.length ; i++) {
			sum += heights[i];
		}
		
		// Calculating the mean height of players
		double mean = sum / 11;
		
		// Print the result
		System.out.print("The mean height of the football team is: " + mean);
		
		sc.close();
	}
}
		