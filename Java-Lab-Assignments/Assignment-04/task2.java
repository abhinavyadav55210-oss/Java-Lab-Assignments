
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 04
// Task 2: Calculate permutation nPr

public class task2 {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {

        int n = 5;
        int r = 2;

        int result = permutation(n, r);

        System.out.println("Permutation (nPr) = " + result);
    }
}

