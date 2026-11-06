
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 04
// Task 3: Find the larger of two numbers

public class task3 {

    static int findLarger(int a, int b) {

        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 40;

        int result = findLarger(num1, num2);

        System.out.println("Larger number is: " + result);
    }
}
