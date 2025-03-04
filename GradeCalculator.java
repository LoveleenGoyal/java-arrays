import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        // Defining arrays for marks
        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];

        // Arrays for percentage and grades
        double[] percentage = new double[students];
        String[] grades = new String[students];

        // Input marks for each student
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            physics[i] = sc.nextDouble();
            while (physics[i] < 0) {
                System.out.print("Invalid input! Enter positive marks: ");
                physics[i] = sc.nextDouble();
            }

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextDouble();
            while (chemistry[i] < 0) {
                System.out.print("Invalid input! Enter positive marks: ");
                chemistry[i] = sc.nextDouble();
            }

            System.out.print("Maths: ");
            maths[i] = sc.nextDouble();
            while (maths[i] < 0) {
                System.out.print("Invalid input! Enter positive marks: ");
                maths[i] = sc.nextDouble();
            }

            // Calculate total marks and percentage
            double totalMarks = physics[i] + chemistry[i] + maths[i];
            percentage[i] = totalMarks / 3.0;

            // Assign grade based on percentage
            grades[i] = (percentage[i] >= 80) ? "A" :
                        (percentage[i] >= 70) ? "B" :
                        (percentage[i] >= 60) ? "C" :
                        (percentage[i] >= 50) ? "D" :
                        (percentage[i] >= 40) ? "E" : "R";
        }

        // Display the report
        System.out.println("\nStudent Grade Report:");
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1) + " Marks:");
            System.out.println("Physics: " + physics[i] + ", Chemistry: " + chemistry[i] + ", Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i] + "%, Grade: " + grades[i]);
        }
        sc.close();
    }
}
