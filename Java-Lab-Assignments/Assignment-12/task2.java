// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 12
// Task 2: Sort a second array using insertion sort

public class task2 {
    public static void main(String[] args) {

        int[] arr = {9, 4, 7, 2, 6};

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