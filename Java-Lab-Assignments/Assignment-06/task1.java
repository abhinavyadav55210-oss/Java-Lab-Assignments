
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 06
// Task 1: Print array in reverse order

public class task1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array in reverse order:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
