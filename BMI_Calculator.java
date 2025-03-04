import java.util.Scanner;

public class BMI_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for total number of persons
		System.out.print("Enter the number of persons: ");
		int persons = sc.nextInt();
		
		// Initalizing the arrays to store weight, height, BMI, and weight status
		double[] weight = new double[persons];
		double[] height = new double[persons];
		double[] bmi = new double[persons];
		String[] status = new String[persons];
		
		for(int i = 0; i < persons; i++) {
			// Taking input for weight and height of persons
			System.out.print("Enter the height of " + (i+1) +" person(in meters): ");
			height[i] = sc.nextDouble();
			System.out.print("Enter the weight of " + (i+1) +" person(in kgs): ");
            weight[i] = sc.nextDouble();

			//Calculating the BMI of each person
			bmi[i] = weight[i] / (height[i] * height[i]);

			//Determining weight status
			if (bmi[i] < 18.5) {
	            status[i] = "Underweight";
			} else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
            	status[i] = "Normal weight";
			} else if (bmi[i] >= 25 && bmi[i] < 29.9) {
            	status[i] = "Overweight";
			} else {
	            status[i] = "Obese";
        	}
		}

		// Display results
        System.out.println("\nDetails of all individuals:");
	    for (int i = 0; i < persons; i++) {
        	System.out.println("Person " + (i + 1) + ": Height = " + height[i] + " m, Weight = " + weight[i] + " kg, BMI = " + bmi[i] + ", Status = " + status[i]);
	    }
		sc.close();
	}
}
		