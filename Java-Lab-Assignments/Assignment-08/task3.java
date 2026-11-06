
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 08
// Task 3: Calculate the sum of each row

public class task3 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + matrix[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }
}
