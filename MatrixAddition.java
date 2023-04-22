package matrix.addition;
import java.util.Scanner;

public class MatrixAddition {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the no. of rows and colums");
			int rows = in.nextInt();
			int columns = in.nextInt();

			System.out.println("Enter the elements of first array");
			int[][] first = getMatrixInput(in, rows, columns);
			System.out.println("Enter the elements of second array");
			int[][] second = getMatrixInput(in, rows, columns);

			int[][] sum = performMatrixAddition(first, second, rows, columns);

			System.out.println("Sum:");
			//System.out.println("Sumtest:);
			//System.out.println("Third SumTest//");
			displayMatrix(sum, rows, columns);
		}
	}

	private static int[][] getMatrixInput(Scanner in, int rows, int columns) {
		// https://stackoverflow.com/questions/5919143/is-it-safe-not-to-close-a-java-scanner-provided-i-close-the-underlying-readable
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		return matrix;
	}

	private static int[][] performMatrixAddition(int[][] first, int[][] second, int rows, int columns) {
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = first[i][j] + second[i][j];
			}
		}
		return matrix;
	}

	private static void displayMatrix(int[][] matrix, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
