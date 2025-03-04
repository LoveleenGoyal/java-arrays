import java.util.Scanner;

public class CalculateBMI_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of persons: ");
		int number = sc.nextInt();
		
		// Multi-Dimensional array to store height, weight and BMI
		double[][] personData = new double[number][3];
		
		// Store weight status of the persons
		String[] status = new String[number];
		
		for(int i = 0; i < number; i++) {
			// Taking input for weight and height of persons
			System.out.print("Enter the height of " + (i+1) +" person(in meters): ");
			personData[i][0] = sc.nextDouble();
			System.out.print("Enter the weight of " + (i+1) +" person(in kgs): ");
            personData[i][1] = sc.nextDouble();

			//Calculating the BMI of each person
			personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

			//Determining weight status
			if (personData[i][2] < 18.5) {
	            status[i] = "Underweight";
			} else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
            	status[i] = "Normal weight";
			} else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
            	status[i] = "Overweight";
			} else {
	            status[i] = "Obese";
        	}
		}
		
		// Display results
        System.out.println("\nDetails of all individuals:");
	    for (int i = 0; i < number; i++) {
        	System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0] + " m, Weight = " + personData[i][1] + " kg, BMI = " + personData[i][2] + ", Status = " + status[i]);
	    }
		sc.close();
	}
}
