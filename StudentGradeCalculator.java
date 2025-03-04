import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number students: ");
		int students = sc.nextInt();
		
		double[][] marks = new double[students][3];
		double[] percentage = new double[students];
		String[] grades = new String[students];
		String[] remarks = new String[students];
		
		for (int i = 0; i < students; i++) {
			System.out.println("\nEnter marks for Student " + (i + 1) + ":");
			
			System.out.print("Physics: ");
			marks[i][0] = sc.nextDouble();
			System.out.print("Chemistry: ");
			marks[i][1] = sc.nextDouble();
			System.out.print("Maths: ");
			marks[i][2] = sc.nextDouble();
			
			if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
				System.out.print("Please enter the positve values");
				i--;
				continue;
			}
			
			double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
			percentage[i] = totalMarks / 3.0;
			
			if (percentage[i] >= 80) {
				grades[i] = "A";
				remarks[i] = "Level 4, above agency-normalized standards";
			} else if (percentage[i] >= 70) {
				grades[i] = "B";
				remarks[i] = "Level 3, at agency-normalized standards";
			} else if (percentage[i] >= 60) {
				grades[i] = "C";
				remarks[i] = "Level 2, below, but approaching agency-normalized standards";
			} else if (percentage[i] >= 50) {
				grades[i] = "D";
				remarks[i] = "Level 1, well below agency-normalized standards";
			} else if (percentage[i] >= 40) {
				grades[i] = "E";
				remarks[i] = "Level 1-, too below agency-normalized standards";
			} else {
				grades[i] = "R";
				remarks[i] = "Remedial standards";
			}
		}
		
		// Display the results
		System.out.println("\nStudent Grade Report:");

        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + " Student:\nPhysics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] +
                    "\nPercentage: " + percentage[i] + "\tGrades: " + grades[i] + "\nRemarks: " + remarks[i]);
        }

        sc.close();
    }
}
		
				