import java.util.Scanner;

public class YoungestAndTallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"Amar", "Akbar", "Anthony"};
		
		// Taking user input for age and height
		int[] ages = new int[3];
		double[] heights = new double[3];
		
		// Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
		
		int minAge = ages[0];
		double maxHeight = heights[0];
		
		// Setting index for youngest and tallest
		int youngest = 0;
		int tallest = 0;
		
		// Finding youngest and tallest
		for (int i = 1 ; i < 3 ; i++) {
			if (ages[i] < minAge) {
				minAge = ages[i];
				youngest = i;
			}
			if (heights[i] > maxHeight) {
				maxHeight = heights[i];
				tallest = i;
			}
		}
		
		// Display the results
		System.out.println("\nYoungest Friend: " + names[youngest] + " Age: " + minAge );
		System.out.println("Tallest Friend: " + names[tallest] + " Height: " + maxHeight);
		sc.close();
		}
	}
		