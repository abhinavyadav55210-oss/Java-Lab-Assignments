
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 02
// Task 4: Find factorial using a for loop

public class task4 {
    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
