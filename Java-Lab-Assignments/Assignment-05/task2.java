
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 05
// Task 2: Find sum and largest array value

public class task2 {
    public static void main(String[] args) {

        int[] arr = {5, 15, 25, 10, 30};

        int sum = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Largest value: " + largest);
    }
}
