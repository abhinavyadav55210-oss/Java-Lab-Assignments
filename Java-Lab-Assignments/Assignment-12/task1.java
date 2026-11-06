// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 12
// Task 1: Sort an array using insertion sort

public class task1 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        System.out.println("Original Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("\nSorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}