// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 12
// Task 3: Count shifts during insertion sort

public class task3 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        int shifts = 0;

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;

                shifts++;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal Shifts: " + shifts);
    }
}