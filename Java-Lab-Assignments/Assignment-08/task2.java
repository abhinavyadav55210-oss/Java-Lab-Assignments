
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 08
// Task 2: Print the transpose of a matrix

public class task2 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
