
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 08
// Task 1: Create and print a 3 by 4 matrix

public class task1 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("3 x 4 Matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
