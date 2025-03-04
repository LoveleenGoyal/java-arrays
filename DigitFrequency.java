import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Frequency array to store count of each digit (0-9)
        int[] frequency = new int[10];

        // Finding frequency of each digit
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        // Displaying frequency of each digit
        System.out.println("Digit Frequency in the given number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

    }
}