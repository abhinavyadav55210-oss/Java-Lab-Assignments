// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 09
// Task 3: Count matrix values greater than 5

public class task3 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 6, 7},
            {8, 9, 5}
        };

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > 5) {
                    count++;
                }
            }
        }

        System.out.println("Count of values greater than 5 = " + count);
    }
}