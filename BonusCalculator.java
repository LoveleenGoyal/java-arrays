import java.util.Scanner;

public class BonusCalculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize arrays for salaries, years of service, bonuses, and new salaries
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to store total values
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // For Loop to take user input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for Employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Try again.");
                i--; // Repeat the input for this employee
                continue;
            }
			
			salaries[i] = salary;
            bonuses[i] = salary * (years > 5 ? 0.05 : 0.02); 
            newSalaries[i] = salary + bonuses[i];

            // Update total values
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display total payout details
        System.out.println("\nTotal Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary: $" + totalNewSalary);
        sc.close(); 
    }
}