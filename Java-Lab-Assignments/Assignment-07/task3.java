
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 07
// Task 3: Count repeated halving steps

public class task3 {
    public static void main(String[] args) {

        int n = 100;
        int count = 0;

        while (n > 1) {
            n = n / 2;
            count++;
        }

        System.out.println("Number of halving steps: " + count);
        System.out.println("Time Complexity: O(log n)");
    }
}
