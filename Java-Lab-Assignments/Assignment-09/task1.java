
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 09
// Task 1: Display the first and last row

public class task1 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("First Row:");

        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        System.out.println("\nLast Row:");

        int lastRow = matrix.length - 1;

        for (int j = 0; j < matrix[lastRow].length; j++) {
            System.out.print(matrix[lastRow][j] + " ");
        }
    }
}