// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 11
// Task 3: Count swaps in bubble sort

public class task3 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal Swaps: " + swaps);
    }
}
