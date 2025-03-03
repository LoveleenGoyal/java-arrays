import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for rows and columns
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		// Declare 2D array
		int[][] matrix = new int[rows][cols];
		
		// Taking user input for 2D array
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 1D array to store elements of 2D array
        int[] array = new int[rows * cols];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
				index++;
            }
        }

        // Display the 1D array
        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close(); 
    }
}
		
