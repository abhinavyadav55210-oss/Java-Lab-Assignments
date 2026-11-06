// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 11
// Task 2: Sort an array using selection sort

public class task2 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        System.out.println("Original Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("\nSorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}