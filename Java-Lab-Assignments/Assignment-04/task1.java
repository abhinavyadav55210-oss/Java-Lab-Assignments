
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 04
// Task 1: Calculate combination nCr

public class task1 {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {

        int n = 5;
        int r = 2;

        int result = combination(n, r);

        System.out.println("Combination (nCr) = " + result);
    }
}
