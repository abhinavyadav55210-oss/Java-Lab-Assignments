
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 07
// Task 2: Count iterations of nested loops

public class task2 {
    public static void main(String[] args) {

        int n = 4;
        int count = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                count++;
            }
        }

        System.out.println("Number of iterations: " + count);
        System.out.println("Time Complexity: O(n^2)");
    }
}
